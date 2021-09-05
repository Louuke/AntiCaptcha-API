package com.anticaptcha.api.captcha;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.TaskResult;

import java.net.URL;
import java.util.HashMap;

public class GeeTestProxyless extends AntiCaptcha {

    final HashMap<String, Object> task = new HashMap<>();

    public GeeTestProxyless(String clientKey) {
        super(clientKey, 0);
        task.put("type", "GeeTestTaskProxyless");
    }

    public GeeTestProxyless(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "GeeTestTaskProxyless");
    }

    public void setWebsiteUrl(URL websiteUrl) {
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

    @Override
    public TaskResult createTask() {
        return super.createTask();
    }

    @Override
    public TaskResult createTask(int maxSecTimeout) {
        return super.createTask(maxSecTimeout);
    }
}
