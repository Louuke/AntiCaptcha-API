package com.anticaptcha.api.request.captcha;

import com.anticaptcha.api.request.AntiCaptchaTask;

import java.util.HashMap;

public class RecaptchaV2Proxyless extends AntiCaptchaTask {

    final HashMap<String, Object> task = new HashMap<>();

    public RecaptchaV2Proxyless(String clientKey) {
        super(clientKey);
        task.put("type", "RecaptchaV2TaskProxyless");
    }

    public RecaptchaV2Proxyless(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "RecaptchaV2TaskProxyless");
    }

    public void setWebsiteUrl(String websiteUrl) {
        task.put("websiteURL", websiteUrl);
    }

    public void setWebsiteKey(String websiteKey) {
        task.put("websiteKey", websiteKey);
    }

    public void setWebsiteSToken(String websiteSToken) {
        task.put("recaptchaDataSValue", websiteSToken);
    }

    public void setInvisible(boolean invisible) {
        task.put("isInvisible", invisible);
    }
}
