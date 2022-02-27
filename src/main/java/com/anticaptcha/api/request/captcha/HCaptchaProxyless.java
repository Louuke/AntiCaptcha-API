package com.anticaptcha.api.request.captcha;

import com.anticaptcha.api.request.AntiCaptchaTask;

import java.util.HashMap;

public class HCaptchaProxyless extends AntiCaptchaTask {

    final HashMap<String, Object> task = new HashMap<>();

    public HCaptchaProxyless(String clientKey) {
        super(clientKey);
        task.put("type", "HCaptchaTaskProxyless");
    }

    public HCaptchaProxyless(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "HCaptchaTaskProxyless");
    }

    public void setWebsiteUrl(String websiteUrl) {
        task.put("websiteURL", websiteUrl);
    }

    public void setWebsiteKey(String websiteKey) {
        task.put("websiteKey", websiteKey);
    }
}
