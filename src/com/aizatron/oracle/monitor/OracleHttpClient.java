package com.aizatron.oracle.monitor;

import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/**
 *
 * neelslotter@gmail.com
 *
 */
public class OracleHttpClient {

    private String header;
    private String body;
    private String method;
    private String url;
    private String token;
    private String params;

    OracleHttpClient() {
    }

    OracleHttpClient(String aUrl, String aHeader, String aBody, String aMethod, String aToken, String aParms) {
        this.header = aHeader;
        this.body = aBody;
        this.method = aMethod;
        this.token = aToken;
        this.params = aParms;
    }

    public Response doGet() throws NoSuchAlgorithmException, KeyManagementException {


        Response response = null;

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8");

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return new java.security.cert.X509Certificate[]{};
                    }
                }
        };
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
        OkHttpClient.Builder newBuilder = new OkHttpClient.Builder();
        newBuilder.sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustAllCerts[0]);
        newBuilder.hostnameVerifier((hostname, session) -> true);

        OkHttpClient client = newBuilder
                .addInterceptor(logging)
                .connectTimeout(15000, TimeUnit.SECONDS)
                .readTimeout(30000, TimeUnit.SECONDS)
                .build();

        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(this.url)
                .get()
                .addHeader("X-API-Key", this.token)
                .addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .build();
        try {
            response = client.newCall(request).execute();
        } catch (Exception vException) {
        }

        return response;
    }


    public Response doPost() throws NoSuchAlgorithmException, KeyManagementException {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8");

        // Ignore certificate for now
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return new java.security.cert.X509Certificate[]{};
                    }
                }
        };

        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
        OkHttpClient.Builder newBuilder = new OkHttpClient.Builder();
        newBuilder.sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustAllCerts[0]);
        newBuilder.hostnameVerifier((hostname, session) -> true);
        // ssl
        OkHttpClient client = newBuilder
                .addInterceptor(logging)
                .connectTimeout(15000, TimeUnit.SECONDS)
                .readTimeout(30000, TimeUnit.SECONDS)
                .build();

        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(this.url)
                .post(RequestBody.create(mediaType, this.body))
                .addHeader("X-API-Key", this.token)
                .addHeader("Accept", "*/*")
                .addHeader("Accept-Encoding", "gzip, deflate, br")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .build();

        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (Exception vException) {
            vException.printStackTrace();
        }

        return response;

    }

    public Response doPcapPost(MultipartBody aRequestBody) throws NoSuchAlgorithmException, KeyManagementException {

        Response response = null;

        MediaType mediaType = MediaType.parse("Content-Type: multipart/form-data;");
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return new java.security.cert.X509Certificate[]{};
                    }
                }
        };
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
        OkHttpClient.Builder newBuilder = new OkHttpClient.Builder();
        newBuilder.sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustAllCerts[0]);
        newBuilder.hostnameVerifier((hostname, session) -> true);

        OkHttpClient client = newBuilder
                .addInterceptor(logging)
                .connectTimeout(15000, TimeUnit.SECONDS)
                .readTimeout(30000, TimeUnit.SECONDS)
                .build();

        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(this.url)
                .post(aRequestBody)
                .addHeader("X-API-Key", this.token)
                .addHeader("Accept", "*/*")
                .addHeader("Accept-Encoding", "gzip, deflate, br")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "multipart/form-data")
                .build();
        try {
            response = client.newCall(request).execute();
        } catch (Exception vException) {
            vException.printStackTrace();
        }

        if(response.code() != 200){
            System.out.println("oops " + response.code() );
            System.out.println("oops " + response.message().toString());
        }
        return response;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }


    @Override
    public String toString() {
        return "OracleHttpClient{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                ", method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", token='" + token + '\'' +
                ", params='" + params + '\'' +
                '}';
    }
}
