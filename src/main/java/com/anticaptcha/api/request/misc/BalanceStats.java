package com.anticaptcha.api.request.misc;

import com.anticaptcha.api.request.AntiCaptchaBase;
import com.anticaptcha.api.response.BalanceResponse;

public class BalanceStats extends AntiCaptchaBase {

    public BalanceStats(String clientKey, int softId) {
        super(clientKey, softId);
    }

    public BalanceStats(String clientKey) {
        super(clientKey);
    }

    public BalanceResponse getBalance() {
        return query(BalanceResponse.class);
    }

    @Override
    protected String getUrl() {
        return "https://api.anti-captcha.com/getBalance";
    }
}
