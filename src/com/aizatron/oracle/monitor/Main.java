package com.aizatron.oracle.monitor;

import com.google.gson.Gson;
import okhttp3.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.Instant;

public class Main {

    static volatile int cnt = 0;
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36";
    private static final String GET_PAGE_CALLS = "https://10.80.52.32/me/getPagedCalls";
    private static final String KEY = "Data_Intergrity;62ce7e7257f9e93b5a0d33f65a";
    private static final String aAlias = "false";
    private static Long unixTimestampNow = Instant.now().toEpochMilli();
    private static final String aOlderTS = String.valueOf(unixTimestampNow);

    private static final String aDate1 = "";
    private static final String aDate2 = "";
    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, ParseException {

        java.lang.String vNextValue = "-1";
        com.aizatron.oracle.monitor.CallObject callObject = null;

        String vSrcNumber = args[0].replaceAll("\"", "\\\\\"");
        String vStartTime = args[1].replaceAll("\"", "\\\\\"");
        String vEndTime = args[2].replaceAll("\"", "\\\\\"");

        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        isoFormat.setTimeZone(TimeZone.getTimeZone("GMT-2"));

        Date date = isoFormat.parse(vStartTime);
        Long millis = date.getTime();

        DefaultFilter vBody =
                new DefaultFilter("1665477899000", "false", vStartTime, vEndTime, "19", vSrcNumber);

        callObject = getNextPage(vBody);
        for (Call call : callObject.getCalls()) {

            //doPrint(callObject);
            AvailablePcaps availablePcaps = GetAvailPcap(call.getId().toString(), call.getPid().toString());

            for (Available avail : availablePcaps.getAvailable()) {
                GetPcapFiles(avail.getName(), vSrcNumber, call.getId().toString(), call.getPid().toString());
            }
        }
    }

    static AvailablePcaps GetAvailPcap(String aId, String aPid) throws NoSuchAlgorithmException, KeyManagementException, IOException {

        OracleHttpClient oracleHttpClient = new OracleHttpClient();
        oracleHttpClient.setToken(KEY);
        oracleHttpClient.setUrl("https://10.80.52.32/me/getAvailablePcaps?id=" + aId + "&pid=" + aPid);
        Response vResp = oracleHttpClient.doGet();
        AvailablePcaps availablePcaps = new Gson().fromJson(String.valueOf(vResp.body().string()), AvailablePcaps.class);
        return availablePcaps;
    }

    static boolean GetPcapFiles(String aName, String aSrcNumber, String aId, String aPid) throws NoSuchAlgorithmException, KeyManagementException, IOException {

        OracleHttpClient oracleHttpClient = new OracleHttpClient();
        oracleHttpClient.setToken(KEY);
        oracleHttpClient.setUrl("https://10.80.52.32/me/callPcap");

        MultipartBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("pid", aPid)
                .addFormDataPart("id", aId)
                .addFormDataPart("streams", "[" + '"' + aName + '"' + "]")
                .addFormDataPart("filename", aSrcNumber.replaceAll("\\+", "") + ".pcap")
                .build();

        Response vResponse = oracleHttpClient.doPcapPost(requestBody);
        InputStream mInputStream = vResponse.body().byteStream();

        PcapHandler pcapHandler = new PcapHandler(mInputStream);
        pcapHandler.GetPcapData();

        return true;
    }

    static void doPrint(com.aizatron.oracle.monitor.CallObject callObject) throws NoSuchAlgorithmException, IOException, KeyManagementException {

        for (Call aCall : callObject.getCalls()) {

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
                    + ',' + aCall.getDstUa());
            cnt++;
        }
    }

    private static java.lang.String encodeValue(String aValue) {
        try {
            return URLEncoder.encode(aValue, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException.getMessage());
        }
    }

    static CallObject getNextPage(DefaultFilter vBody) throws NoSuchAlgorithmException, IOException, KeyManagementException {

        try {
            java.lang.String vChunks[] = vBody.toString().split("\\[", 3);
            String vEncoded = encodeValue("[" + vChunks[1]);
            String vNewBody = vChunks[0] + vEncoded;

            OracleHttpClient OracleHttpClient = new OracleHttpClient();
            OracleHttpClient.setToken(KEY);
            OracleHttpClient.setUrl(GET_PAGE_CALLS);
            OracleHttpClient.setBody(vNewBody.toString());

            Response vResponse = OracleHttpClient.doPost();
            return new Gson().fromJson(String.valueOf(vResponse.body().string()), CallObject.class);
        } catch (Exception vExeption) {
            vExeption.printStackTrace();
        }
        return new Gson().fromJson(String.valueOf(""), CallObject.class);
    }
}
