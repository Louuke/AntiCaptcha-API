package com.anticaptcha.api.request.misc;

import com.anticaptcha.api.request.AntiCaptchaBase;
import com.anticaptcha.api.response.QueueStatsResponse;
import com.google.gson.Gson;

public class QueueStats extends AntiCaptchaBase {

    private int queueId = 6;

    public QueueStats(String clientKey, int softId) {
        super(clientKey, softId);
    }

    public QueueStats(String clientKey) {
        super(clientKey);
    }

    public QueueStats setQueueId(int queueId) {
        this.queueId = queueId;
        return this;
    }

    public QueueStatsResponse getQueueStats() {
        return query(QueueStatsResponse.class);
    }

    @Override
    protected String getUrl() {
        return "https://api.anti-captcha.com/getQueueStats";
    }
}
