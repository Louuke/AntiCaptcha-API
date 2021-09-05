package com.anticaptcha;

import com.anticaptcha.api.AntiCaptcha;

public class Main {

    private static String APIKEY = "";

    public static void main(String[] args) {
        AntiCaptcha antiCaptcha = new AntiCaptcha(APIKEY, 0);
        System.out.println(antiCaptcha.getBalance().getBalance());
    }
}
