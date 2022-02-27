package com.anticaptcha.api.request.misc;

import com.anticaptcha.api.request.AntiCaptchaBase;
import com.anticaptcha.api.response.SendFundsResponse;

public class SendFunds extends AntiCaptchaBase {

    private String accountLogin, accountEmail;
    private double amount;

    public SendFunds(String clientKey) {
        super(clientKey, 0);
    }

    public SendFunds setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
        return this;
    }

    public SendFunds setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
        return this;
    }

    public SendFunds setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    protected SendFundsResponse sendFunds() {
        return query(SendFundsResponse.class);
    }

    @Override
    public String getUrl() {
        return "https://api.anti-captcha.com/sendFunds";
    }
}
