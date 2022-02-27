package com.anticaptcha;

import com.anticaptcha.api.request.misc.BalanceStats;

public class Main {

    private static String APIKEY = "";

    public static void main(String[] args) {
        BalanceStats antiCaptcha = new BalanceStats(APIKEY);
        System.out.println(antiCaptcha.getBalance().getBalance());
    }
}
