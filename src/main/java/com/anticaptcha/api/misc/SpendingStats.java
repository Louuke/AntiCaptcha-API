package com.anticaptcha.api.misc;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.SpendingStatsResponse;

public class SpendingStats extends AntiCaptcha {

    private int date;
    private String queue, ip;

    public SpendingStats(String clientKey) {
        super(clientKey, 0);
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

    @Override
    public SpendingStatsResponse getSpendingStats() {
        return super.getSpendingStats();
    }
}
