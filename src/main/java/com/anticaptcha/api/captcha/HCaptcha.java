package com.anticaptcha.api.captcha;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HCaptcha extends HCaptchaProxyless {

    private String cookies, proxyLogin, proxyPassword, userAgent, proxyAddress, proxyType;
    private int proxyPort;

    public HCaptcha(String clientKey) {
        super(clientKey, 0);
        task.put("type", "HCaptchaTask");
    }

    public HCaptcha(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "HCaptchaTask");
    }

    public void setProxyLogin(String proxyLogin) {
        task.put("proxyLogin", proxyLogin);
    }

    public void setProxyPassword(String proxyPassword) {
        task.put("proxyPassword", proxyPassword);
    }

    public void setProxyPort(int proxyPort) {
        task.put("proxyPort", proxyPort);
    }

    public void setProxyType(ProxyTypeOption proxyType) {
        task.put("proxyType", proxyType.toString().toLowerCase());
    }

    public void setUserAgent(String userAgent) {
        task.put("userAgent", userAgent);
    }

    public void setProxyAddress(String proxyAddress) {
        try {
            task.put("proxyAddress", InetAddress.getByName(proxyAddress).getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
