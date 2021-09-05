package com.anticaptcha.api.captcha;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.TaskResult;

import java.net.URL;
import java.util.HashMap;

public class FunCaptchaProxyless extends AntiCaptcha {

    final HashMap<String, Object> task = new HashMap<>();

    public FunCaptchaProxyless(String clientKey) {
        super(clientKey, 0);
        task.put("type", "FunCaptchaTaskProxyless");
    }

    public FunCaptchaProxyless(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "FunCaptchaTaskProxyless");
    }

    public void setWebsiteUrl(URL websiteUrl) {
        task.put("websiteURL", websiteUrl);
    }

    public void setWebsitePublicKey(String websitePublicKey) {
        task.put("websitePublicKey", websitePublicKey);
    }

    public void setFunCaptchaApiJSSubdomain(String funCaptchaApiJSSubdomain) {
        task.put("funcaptchaApiJSSubdomain", funCaptchaApiJSSubdomain);
    }

    public void setDataBlob(String dataBlob) {
        task.put("data", dataBlob);
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
