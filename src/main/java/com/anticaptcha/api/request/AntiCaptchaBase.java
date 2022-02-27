package com.anticaptcha.api.request;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class AntiCaptchaBase {

    private final transient HttpRequestFactory factory = new NetHttpTransport().createRequestFactory();
    private final transient Gson gson = new Gson();

    protected final String clientKey;
    protected final int softId;

    public enum ProxyTypeOption {
        HTTP,
        SOCKS4,
        SOCKS5
    }

    public AntiCaptchaBase(String clientKey, int softId) {
        this.clientKey = clientKey;
        this.softId = softId;
    }

    public AntiCaptchaBase(String clientKey) {
        this(clientKey, 0);
    }

    protected <T> T query(Class<T> clazz) {
        try {
            HttpRequest request = factory.buildPostRequest(new GenericUrl(getUrl()), getBody());
            HttpResponse response = request.execute();
            return gson.fromJson(response.parseAsString(), clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return createInstance(clazz);
    }

    private <T> T createInstance(Class<T> clazz) {
        try {
            return clazz.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract String getUrl();

    private HttpContent getBody() {
        return ByteArrayContent.fromString("application/json", gson.toJson(this));
    }
}
