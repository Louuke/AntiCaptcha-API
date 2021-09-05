package com.anticaptcha.api.response;

import java.util.HashMap;
import java.util.List;

public class AppStatsResponse {

    private int errorId;
    private String errorCode, errorDescription, fromDate, toDate;
    private List<HashMap<String, Object>> chartData;

    public int getErrorId() {
        return errorId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public List<HashMap<String, Object>> getChartData() {
        return chartData;
    }
}
