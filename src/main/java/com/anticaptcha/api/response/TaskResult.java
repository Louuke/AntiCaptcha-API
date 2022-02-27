package com.anticaptcha.api.response;

import com.anticaptcha.api.request.misc.task.ImageIncorrectRequest;
import com.anticaptcha.api.request.misc.task.ReCorrectRequest;
import com.anticaptcha.api.request.misc.task.ReIncorrectRequest;
import com.anticaptcha.api.response.utils.SolutionData;

public class TaskResult {

    private int errorId, createTime, endTime, solveCount;
    private double cost;
    private String errorCode, errorDescription, status = "error", ip;
    private SolutionData solution;

    private transient String clientKey;
    private transient int taskId;

    public enum Response {
        PROCESSING,
        READY
    }

    public int getErrorId() {
        return errorId;
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

    public int getTaskId() {
        return taskId;
    }

    public void setReportInfo(String clientKey, int taskId) {
        this.clientKey = clientKey;
        this.taskId = taskId;
    }

    public ReportResponse reportCorrectRecaptcha() {
        ReCorrectRequest correctRequest = new ReCorrectRequest(clientKey, taskId);
        return correctRequest.report();
    }

    public ReportResponse reportIncorrectRecaptcha() {
        ReIncorrectRequest incorrectRequest = new ReIncorrectRequest(clientKey, taskId);
        return incorrectRequest.report();
    }

    public ReportResponse reportIncorrectImageCaptcha() {
        ImageIncorrectRequest incorrectRequest = new ImageIncorrectRequest(clientKey, taskId);
        return incorrectRequest.report();
    }
}
