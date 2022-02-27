package com.anticaptcha.api.request.misc;

import com.anticaptcha.api.request.AntiCaptchaBase;
import com.anticaptcha.api.response.SpendingStatsResponse;

public class SpendingStats extends AntiCaptchaBase {

    private int date;
    private String queue, ip;

    public SpendingStats(String clientKey, int softId) {
        super(clientKey, softId);
    }

    public SpendingStats(String clientKey) {
        super(clientKey);
    }

    public SpendingStats setDate(int date) {
        this.date = date;
        return this;
    }

    public SpendingStats setQueue(String queue) {
        this.queue = queue;
        return this;
    }

    public SpendingStats setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public SpendingStatsResponse getSpendingStats() {
        return query(SpendingStatsResponse.class);
    }

    @Override
    protected String getUrl() {
        return "https://api.anti-captcha.com/getQueueStats";
    }
}
