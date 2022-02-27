package com.anticaptcha.api.request.misc.task;

import com.anticaptcha.api.request.AntiCaptchaBase;

public class TaskResultRequest extends AntiCaptchaBase {

    private int taskId;

    public TaskResultRequest(String clientKey, int taskId, int softId) {
        super(clientKey, softId);
        this.taskId = taskId;
    }

    @Override
    public String getUrl() {
        return "https://api.anti-captcha.com/getTaskResult";
    }
}
