package com.anticaptcha.api.response;

public class BalanceResponse {

    private int errorId;
    private String errorCode, errorDescription;
    private float balance;

    public int getErrorId() {
        return errorId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public float getBalance() {
        return balance;
    }
}
