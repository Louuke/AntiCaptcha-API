package com.anticaptcha.api.response.utils;

import java.util.HashMap;
import java.util.List;

public class SolutionData {

    private String gRecaptchaResponse, text, url, token, challenge, validate, secCode;
    private HashMap<String, String> cookies;

    public String getGRecaptchaResponse() {
        return gRecaptchaResponse;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public String getToken() {
        return token;
    }

    public String getChallenge() {
        return challenge;
    }

    public String getValidate() {
        return validate;
    }

    public String getSecCode() {
        return secCode;
    }

    public HashMap<String, String> getCookies() {
        return cookies;
    }
}
