package com.anticaptcha.api.response;

public class SendFundsResponse {

    private int errorId;
    private String errorCode, errorDescription;
    private double balanceLeft;

    public int getErrorId() {
        return errorId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public double getBalanceLeft() {
        return balanceLeft;
    }
}
