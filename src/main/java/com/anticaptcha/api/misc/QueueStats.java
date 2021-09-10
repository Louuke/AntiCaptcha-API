package com.anticaptcha.api.misc;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.QueueStatsResponse;

public class QueueStats extends AntiCaptcha {

    private int queueId = 6;

    public QueueStats(String clientKey) {
        super(clientKey, 0);
    }

    public QueueStats setQueueId(int queueId) {
        this.queueId = queueId;
        return this;
    }

    @Override
    public QueueStatsResponse getQueueStats() {
        return super.getQueueStats();
    }
}
