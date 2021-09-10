package com.anticaptcha.api.captcha;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.TaskResult;

import java.net.URL;
import java.util.HashMap;

public class HCaptchaProxyless extends AntiCaptcha {

    final HashMap<String, Object> task = new HashMap<>();

    public HCaptchaProxyless(String clientKey) {
        super(clientKey, 0);
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

    @Override
    public TaskResult createTask() {
        return super.createTask();
    }

    @Override
    public TaskResult createTask(int maxSecTimeout) {
        return super.createTask(maxSecTimeout);
    }
}
