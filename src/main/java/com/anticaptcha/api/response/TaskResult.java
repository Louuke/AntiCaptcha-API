package com.anticaptcha.api.response;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.utils.SolutionData;

public class TaskResult {

    private int errorId, taskId, createTime, endTime, solveCount;
    private double cost;
    private String errorCode, errorDescription, status, ip;
    private SolutionData solution;
    private AntiCaptcha captchaBase;

    public enum Response {
        PROCESSING,
        READY
    }

    public int getErrorId() {
        return errorId;
    }

    public int getTaskId() {
        return taskId;
    }

    public int getCreateTime() {
        return createTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getSolveCount() {
        return solveCount;
    }

    public double getCost() {
        return cost;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public String getStatus() {
        return status;
    }

    public String getIp() {
        return ip;
    }

    public SolutionData getSolution() {
        return solution;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setCaptchaBase(AntiCaptcha captchaBase) {
        this.captchaBase = captchaBase;
    }

    public ReportResponse reportCorrectRecaptcha() {
        return captchaBase.report("https://api.anti-captcha.com/reportCorrectRecaptcha", taskId);
    }

    public ReportResponse reportIncorrectRecaptcha() {
        return captchaBase.report("https://api.anti-captcha.com/reportIncorrectRecaptcha", taskId);
    }

    public ReportResponse reportIncorrectImageCaptcha() {
        return captchaBase.report("https://api.anti-captcha.com/reportIncorrectImageCaptcha", taskId);
    }
}
