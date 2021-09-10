package com.anticaptcha.api.captcha;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.TaskResult;

import java.util.HashMap;

public class RecaptchaV2Proxyless extends AntiCaptcha {

    final HashMap<String, Object> task = new HashMap<>();

    public RecaptchaV2Proxyless(String clientKey) {
        super(clientKey, 0);
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

    @Override
    public TaskResult createTask() {
        return super.createTask();
    }

    @Override
    public TaskResult createTask(int maxSecTimeout) {
        return super.createTask(maxSecTimeout);
    }
}
