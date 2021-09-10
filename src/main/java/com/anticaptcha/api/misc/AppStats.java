package com.anticaptcha.api.misc;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.AppStatsResponse;

public class AppStats extends AntiCaptcha {

    private String mode;

    public AppStats(String clientKey, int softId) {
        super(clientKey, softId);
    }

    public AppStats setMode(String mode) {
        this.mode = mode;
        return this;
    }

    @Override
    public AppStatsResponse getAppStats() {
        return super.getAppStats();
    }
}
