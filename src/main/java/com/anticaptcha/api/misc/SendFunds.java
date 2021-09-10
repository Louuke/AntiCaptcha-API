package com.anticaptcha.api.misc;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.SendFundsResponse;

public class SendFunds extends AntiCaptcha {

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

    @Override
    protected SendFundsResponse sendFunds() {
        return super.sendFunds();
    }
}
