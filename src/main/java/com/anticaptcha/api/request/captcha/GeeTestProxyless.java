package com.anticaptcha.api.request.captcha;

import com.anticaptcha.api.request.AntiCaptchaTask;

import java.util.HashMap;

public class GeeTestProxyless extends AntiCaptchaTask {

    final HashMap<String, Object> task = new HashMap<>();

    public GeeTestProxyless(String clientKey) {
        super(clientKey, 0);
        task.put("type", "GeeTestTaskProxyless");
    }

    public GeeTestProxyless(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "GeeTestTaskProxyless");
    }

    public void setWebsiteUrl(String websiteUrl) {
        task.put("websiteURL", websiteUrl);
    }

    public void setGT(String gt) {
        task.put("gt", gt);
    }

    public void setChallenge(String challenge) {
        task.put("challenge", challenge);
    }

    public void setGeeTestApiServerSubdomain(String geeTestApiServerSubdomain) {
        task.put("geetestApiServerSubdomain", geeTestApiServerSubdomain);
    }

    public void setGeeTestLib(String geeTestLib) {
        task.put("geetestGetLib", geeTestLib);
    }
}
