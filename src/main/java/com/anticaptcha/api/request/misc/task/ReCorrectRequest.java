package com.anticaptcha.api.request.misc.task;

import com.anticaptcha.api.request.AntiCaptchaBase;
import com.anticaptcha.api.response.ReportResponse;
import com.google.gson.Gson;

public class ReCorrectRequest extends AntiCaptchaBase {

    private int taskId;

    public ReCorrectRequest(String clientKey, int taskId) {
        super(clientKey);
        this.taskId = taskId;
    }

    public ReportResponse report() {
        return query(ReportResponse.class);
    }

    @Override
    protected String getUrl() {
        return "https://api.anti-captcha.com/reportCorrectRecaptcha";
    }
}
