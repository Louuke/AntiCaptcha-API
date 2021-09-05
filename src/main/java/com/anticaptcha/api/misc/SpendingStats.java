package com.anticaptcha.api.misc;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.SpendingStatsResponse;

public class SpendingStats extends AntiCaptcha {

    private int date;
    private String queue, ip;

    public SpendingStats(String clientKey) {
        super(clientKey, 0);
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public SpendingStatsResponse getSpendingStats() {
        return super.getSpendingStats();
    }
}
