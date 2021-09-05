package com.anticaptcha.api;

import com.anticaptcha.api.response.*;
import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class AntiCaptcha {

    private final String clientKey;
    private final int softId;

    public enum ProxyTypeOption {
        HTTP,
        SOCKS4,
        SOCKS5
    }

    public AntiCaptcha(String clientKey, int softId) {
        this.clientKey = clientKey;
        this.softId = softId;
    }

    public BalanceResponse getBalance() {
        String url = "https://api.anti-captcha.com/getBalance";
        Gson gson = new Gson();
        return gson.fromJson(query(url, gson.toJson(getPostData())), BalanceResponse.class);
    }

    protected QueueStatsResponse getQueueStats() {
        String url = "https://api.anti-captcha.com/getQueueStats";
        Gson gson = new Gson();
        return gson.fromJson(query(url, gson.toJson(getPostData())), QueueStatsResponse.class);
    }

    protected SpendingStatsResponse getSpendingStats() {
        String url = "https://api.anti-captcha.com/getSpendingStats";
        Gson gson = new Gson();
        return gson.fromJson(query(url, gson.toJson(getPostData())), SpendingStatsResponse.class);
    }

    protected AppStatsResponse getAppStats() {
        String url = "https://api.anti-captcha.com/getAppStats";
        Gson gson = new Gson();
        return gson.fromJson(query(url, gson.toJson(getPostData())), AppStatsResponse.class);
    }

    protected SendFundsResponse sendFunds() {
        String url = "https://api.anti-captcha.com/sendFunds";
        Gson gson = new Gson();
        return gson.fromJson(query(url, gson.toJson(getPostData())), SendFundsResponse.class);
    }

    public ReportResponse report(String url, int taskId) {
        String body = String.format("{\"clientKey\":\"%s\",\"taskId\":%s}", clientKey, taskId);
        Gson gson = new Gson();
        return gson.fromJson(query(url, body), ReportResponse.class);
    }

    protected TaskResult createTask() {
        return createTask(300);
    }

    protected TaskResult createTask(int maxSecTimeout) {
        String url = "https://api.anti-captcha.com/createTask";
        Gson gson = new Gson();
        TaskResult taskResult = gson.fromJson(query(url, gson.toJson(getPostData())), TaskResult.class);
        if(taskResult.getErrorId() == 0) {
            return getTaskResult(taskResult.getTaskId(), maxSecTimeout);
        }
        return taskResult;
    }

    protected TaskResult getTaskResult(int taskId, int maxSecTimeout) {
        String url = "https://api.anti-captcha.com/getTaskResult";
        String body = String.format("{\"clientKey\":\"%s\",\"taskId\": %s}", clientKey, taskId);
        TaskResult result = null;
        for(int i = 0; i <= maxSecTimeout; i += 3) {
            String s = query(url, body);
            System.out.println(s);
            result = new Gson().fromJson(s, TaskResult.class);
            if(result.getStatus().equals(TaskResult.Response.READY.toString().toLowerCase())) {
                result.setCaptchaBase(this);
                result.setTaskId(taskId);
                break;
            } else {
                waitSec(3);
            }
        }
        return result;
    }

    private String query(String url, String body) {
        HttpRequestFactory factory = new NetHttpTransport().createRequestFactory();
        try {
            HttpRequest request = factory.buildPostRequest(new GenericUrl(url), ByteArrayContent.fromString("application/json", body));
            HttpResponse response = request.execute();
            return read(response.getContent());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String read(InputStream is) throws IOException {
        byte[] buffer = new byte[1024*64];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int numRead;
        while ((numRead = is.read(buffer)) != -1) {
            baos.write(buffer,  0,  numRead);
        }
        return baos.toString(StandardCharsets.UTF_8);
    }

    private void waitSec(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Object getPostData() {
        return this;
    }
}
