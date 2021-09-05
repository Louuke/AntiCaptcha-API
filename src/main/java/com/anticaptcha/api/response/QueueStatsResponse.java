package com.anticaptcha.api.response;

public class QueueStatsResponse {

    private int waiting, total;
    private double load, bid, speed;

    public int getWaiting() {
        return waiting;
    }

    public int getTotal() {
        return total;
    }

    public double getLoad() {
        return load;
    }

    public double getBid() {
        return bid;
    }

    public double getSpeed() {
        return speed;
    }
}
