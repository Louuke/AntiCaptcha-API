package com.anticaptcha.api.misc;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.SendFundsResponse;

public class SendFunds extends AntiCaptcha {

    private String accountLogin, accountEmail;
    private double amount;

    public SendFunds(String clientKey) {
        super(clientKey, 0);
    }

    public void setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    protected SendFundsResponse sendFunds() {
        return super.sendFunds();
    }
}
