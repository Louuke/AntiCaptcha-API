package com.anticaptcha.api.request.captcha;

import com.anticaptcha.api.request.AntiCaptchaTask;

import java.util.HashMap;

public class FunCaptchaProxyless extends AntiCaptchaTask {

    final HashMap<String, Object> task = new HashMap<>();

    public FunCaptchaProxyless(String clientKey) {
        super(clientKey, 0);
        task.put("type", "FunCaptchaTaskProxyless");
    }

    public FunCaptchaProxyless(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "FunCaptchaTaskProxyless");
    }

    public void setWebsiteUrl(String websiteUrl) {
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
}
