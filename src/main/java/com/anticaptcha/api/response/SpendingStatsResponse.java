package com.anticaptcha.api.response;

import java.util.HashMap;
import java.util.List;

public class SpendingStatsResponse {

    private int errorId;
    private String errorCode, errorDescription;
    private List<HashMap<String, Double>> data;

    public int getErrorId() {
        return errorId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public List<HashMap<String, Double>> getSpendingStats() {
        return data;
    }
}
