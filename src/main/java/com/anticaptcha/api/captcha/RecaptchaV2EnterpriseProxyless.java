package com.anticaptcha.api.captcha;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.TaskResult;

import java.net.URL;
import java.util.HashMap;

public class RecaptchaV2EnterpriseProxyless extends AntiCaptcha {

    final HashMap<String, Object> task = new HashMap<>();

    public RecaptchaV2EnterpriseProxyless(String clientKey) {
        super(clientKey, 0);
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

    @Override
    public TaskResult createTask() {
        return super.createTask();
    }

    @Override
    public TaskResult createTask(int maxSecTimeout) {
        return super.createTask(maxSecTimeout);
    }
}
