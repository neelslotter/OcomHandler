package com.aizatron.oracle.monitor;

import com.google.gson.Gson;
import io.pkts.packet.sip.SipMessage;
import okhttp3.*;

import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * The program implements Oracle's OCOM REST API
 *
 * @author Neels Lötter
 * @version 0.0.1
 * @since 2022-10-13
 */
public class Main {

    private static String GET_BASE_URL = "https://10.80.52.32/me/";
    private static String KEY = "Data_Intergrity;62ce7e7257f9e93b5a0d33f65a";
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static volatile int cnt = 0;
    private static boolean printCallObj = true;
    private static String CONFIG_FILE = "/tmp/app.conf";

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, ParseException {

        // Next value can be use to page OCOM results pages
        java.lang.String vNextValue = "-1";
        com.aizatron.oracle.monitor.CallObject callObject;

        java.util.Properties mProps = readConfig();
        try {
            GET_BASE_URL = mProps.getProperty("app.url");
            KEY = mProps.getProperty("app.key");
        } catch (Exception vException) {
            System.out.println(" Unable to read config file, using defaults...");
            System.exit(1);
        }

        // CMD line parsing
        java.lang.String vSrcNumber = args[0].replaceAll("\"", "\\\\\"");
        java.lang.String vStartTime = args[1].replaceAll("\"", "\\\\\"");
        java.lang.String vEndTime = args[2].replaceAll("\"", "\\\\\"");
        java.util.Date date = SIMPLE_DATE_FORMAT.parse(vEndTime);
        long millis = date.getTime();

        // Start build request
        com.aizatron.oracle.monitor.DefaultFilter vBody =
                new DefaultFilter(Long.toString(millis), "false", vStartTime, vEndTime, "19", vSrcNumber);

        // Do initial REST API call now
        callObject = getNextPage(vBody);
        if (callObject == null) {
            System.out.println("No calls found for " + vSrcNumber);
            System.exit(1);
        }
        if (callObject.getCalls().isEmpty()) {
            System.out.println("No calls found for " + vSrcNumber);
            System.exit(2);
        }
        if (printCallObj)
            doPrint(callObject);


        // Main Loop
        // Foreach call object returned by OCOM...
        for (com.aizatron.oracle.monitor.Call call : callObject.getCalls()) {

            AvailablePcaps availablePcaps = GetAvailPcap(call.getId().toString(), call.getPid().toString());

            if (availablePcaps == null) {
                System.out.println("No pcaps found for " + vSrcNumber);
                System.exit(3);
            }
            if (availablePcaps.getAvailable().isEmpty()) {
                System.out.println("No pcaps found for " + vSrcNumber);
                System.exit(4);
            }

            for (Available avail : availablePcaps.getAvailable()) {

                final java.util.List<SipMessage> sipMessages = GetPcapFiles(avail.getName(), vSrcNumber, call.getId().toString(), call.getPid().toString());
                if (sipMessages == null) {
                    System.out.println("No SIP messsages found for " + vSrcNumber);
                }
                else if (sipMessages.isEmpty()) {
                    System.out.println("No SIP messsages found for " + vSrcNumber);
                }
                else {
                    printSip(sipMessages);
                }

            }
        }
    }

    /**
     * @param aId
     * @param aPid
     * @return AvailablePcaps
     */
    static AvailablePcaps GetAvailPcap(String aId, String aPid) {

        AvailablePcaps availablePcaps;
        try {
            OracleHttpClient oracleHttpClient = new OracleHttpClient();
            oracleHttpClient.setToken(KEY);
            oracleHttpClient.setUrl(GET_BASE_URL + "getAvailablePcaps?id=" + aId + "&pid=" + aPid);
            Response vResp = oracleHttpClient.doGet();
            availablePcaps = new Gson().fromJson(String.valueOf(vResp.body().string()), AvailablePcaps.class);
        } catch (Exception vExeption) {
            vExeption.printStackTrace();
            availablePcaps = new Gson().fromJson("", AvailablePcaps.class);
        }
        // Note: could return empty
        return availablePcaps;
    }

    static Properties readConfig() {

        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream(CONFIG_FILE)) {
            prop.load(fis);
        } catch (Exception vException){
            vException.printStackTrace();
        }
        //could be empty
        return prop;
    }


    /**
     * @param aName
     * @param aSrcNumber
     * @param aId
     * @param aPid
     * @return List<SipMessage>
     */
    static List<SipMessage> GetPcapFiles(String aName, String aSrcNumber, String aId, String aPid) {

        java.util.List<SipMessage> sipMessages = new ArrayList<>();

        try {
            OracleHttpClient oracleHttpClient = new OracleHttpClient();
            oracleHttpClient.setToken(KEY);
            oracleHttpClient.setUrl(GET_BASE_URL + "callPcap");

            MultipartBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("pid", aPid)
                    .addFormDataPart("id", aId)
                    .addFormDataPart("streams", "[" + '"' + aName + '"' + "]")
                    .addFormDataPart("filename", aSrcNumber.replaceAll("\\+", "") + ".pcap")
                    .build();

            Response vResponse = oracleHttpClient.doPcapPost(requestBody);
            InputStream mInputStream = vResponse.body().byteStream();
            PcapHandler pcapHandler = new PcapHandler(mInputStream);
            sipMessages = pcapHandler.GetPcapData();

        } catch (Exception vException) {
            vException.printStackTrace();
        }

        // could return empty list
        return sipMessages;
    }

    /**
     * @param callObject - Print all the callobjects fields
     */
    static void doPrint(com.aizatron.oracle.monitor.CallObject callObject) {

        for (Call aCall : callObject.getCalls()) {

           // System.out.println(cnt + " "+ aCall.toString());
            System.out.println(cnt + ","
                    + aCall.getSetupStartTs()
                    + "," + aCall.getSrcUser()
                    + "," + aCall.getStateMsg()
                    + "," + aCall.getCallTime()
                    + "," + aCall.getStateMsg()
                    + "," + aCall.getPid()
                    + "," + aCall.getId()
                    + ',' + aCall.getDstUser()
                    + ',' + aCall.getCode()
                    + ',' + aCall.getCallTime()
                    + ',' + aCall.getDstCodecs()
                    + ',' + aCall.getSrcUa()
                    + ',' + aCall.getSrcIp()
                    + ',' + aCall.getDstIp()
                    + ',' + aCall.getDstUa());
            cnt++;
        }
    }

    /**
     * @param aValue
     * @return encoded String
     */
    private static java.lang.String encodeValue(String aValue) {
        try {
            return URLEncoder.encode(aValue, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException.getMessage());
        }
    }

    /**
     * Loops
     *
     * @param vBody
     * @return
     */
    static CallObject getNextPage(DefaultFilter vBody) {

        try {

            java.lang.String[] vChunks = vBody.toString().split("\\[", 3);
            String vEncoded = encodeValue("[" + vChunks[1]);
            String vNewBody = vChunks[0] + vEncoded;

            OracleHttpClient oracleHttpClient = new OracleHttpClient();
            oracleHttpClient.setToken(KEY);
            oracleHttpClient.setUrl(GET_BASE_URL + "getPagedCalls");
            oracleHttpClient.setBody(vNewBody.toString());

            Response vResponse = oracleHttpClient.doPost();
            return new Gson().fromJson(String.valueOf(vResponse.body().string()), CallObject.class);

        } catch (java.lang.Exception vExeption) {
            vExeption.printStackTrace();
        }

        // Note: return empty
        System.out.println("returning empty callobject !");
        return new Gson().fromJson("", CallObject.class);
    }

    /**
     * Prints out all the SIP messages
     *
     * @param sipMessages
     */
    static void printSip(List<SipMessage> sipMessages) {

        for (SipMessage sip : sipMessages) {

            if (sip.isCancel()) {
                //tbd
            }
            if (sip.isTimeout()) {
                //tbd
            }
            if (sip.isBye()) {
                //tbd
            }
            if (sip.isSuccess()) {
                //tbd
            }
            if (sip.isResponse()) {
                //tbd
            }

            System.out.println("from " + sip.getFromHeader());
            System.out.println("to " + sip.getToHeader());
            System.out.println(sip.toString());
        }
    }
}
