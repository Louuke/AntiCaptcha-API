package com.anticaptcha.api.request.misc;

import com.anticaptcha.api.request.AntiCaptchaBase;
import com.anticaptcha.api.response.AppStatsResponse;
import com.google.gson.Gson;

public class AppStats extends AntiCaptchaBase {

    private String mode;

    public AppStats(String clientKey, int softId) {
        super(clientKey, softId);
    }

    public AppStats(String clientKey) {
        super(clientKey);
    }

    public AppStats setMode(String mode) {
        this.mode = mode;
        return this;
    }

    protected AppStatsResponse getAppStats() {
        return query(AppStatsResponse.class);
    }

    @Override
    protected String getUrl() {
        return "https://api.anti-captcha.com/getAppStats";
    }
}
