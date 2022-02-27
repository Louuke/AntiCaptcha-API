package com.anticaptcha.api.request.misc.task;

import com.anticaptcha.api.request.AntiCaptchaBase;
import com.anticaptcha.api.response.ReportResponse;

public class ImageIncorrectRequest extends AntiCaptchaBase {

    private int taskId;

    public ImageIncorrectRequest(String clientKey, int taskId) {
        super(clientKey);
        this.taskId = taskId;
    }

    public ReportResponse report() {
        return query(ReportResponse.class);
    }

    @Override
    public String getUrl() {
        return "https://api.anti-captcha.com/reportIncorrectImageCaptcha";
    }
}
