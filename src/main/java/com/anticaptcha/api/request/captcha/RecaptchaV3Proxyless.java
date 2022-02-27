package com.anticaptcha.api.request.captcha;

import com.anticaptcha.api.request.AntiCaptchaTask;

import java.util.HashMap;

public class RecaptchaV3Proxyless extends AntiCaptchaTask {

    private final HashMap<String, Object> task = new HashMap<>();

    public RecaptchaV3Proxyless(String clientKey) {
        super(clientKey);
        task.put("type", "RecaptchaV3TaskProxyless");
    }

    public RecaptchaV3Proxyless(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "RecaptchaV3TaskProxyless");
    }

    public void setWebsiteUrl(String websiteUrl) {
        task.put("websiteURL", websiteUrl);
    }

    public void setWebsiteKey(String websiteKey) {
        task.put("websiteKey", websiteKey);
    }

    public void setMinScore(double minScore) {
        if (minScore != 0.3 && minScore != 0.7 && minScore != 0.9) {
            System.err.println("minScore must be one of these: 0.3, 0.7, 0.9; you passed " + minScore);
        } else {
            task.put("minScore", minScore);
        }
    }

    public void setEnterprise(boolean enterprise) {
        task.put("isEnterprise", enterprise);
    }

    public void setPageAction(String pageAction) {
        task.put("pageAction", pageAction);
    }
}
