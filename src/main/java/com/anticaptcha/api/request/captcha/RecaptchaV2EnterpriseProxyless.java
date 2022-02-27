package com.anticaptcha.api.request.captcha;

import com.anticaptcha.api.request.AntiCaptchaTask;

import java.util.HashMap;

public class RecaptchaV2EnterpriseProxyless extends AntiCaptchaTask {

    final HashMap<String, Object> task = new HashMap<>();

    public RecaptchaV2EnterpriseProxyless(String clientKey) {
        super(clientKey);
        task.put("type", "RecaptchaV2EnterpriseTaskProxyless");
    }

    public RecaptchaV2EnterpriseProxyless(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "RecaptchaV2EnterpriseTaskProxyless");
    }

    public void setWebsiteUrl(String websiteUrl) {
        task.put("websiteURL", websiteUrl);
    }

    public void setWebsiteKey(String websiteKey) {
        task.put("websiteKey", websiteKey);
    }

    public void setEnterprisePayload(String name, String payload) {
        HashMap<String, String> h = new HashMap<>();
        h.put(name, payload);
        task.put("enterprisePayload", h);
    }
}
