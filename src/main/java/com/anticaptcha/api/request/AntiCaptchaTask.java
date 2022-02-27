package com.anticaptcha.api.request;

import com.anticaptcha.api.request.misc.task.TaskResultRequest;
import com.anticaptcha.api.response.TaskResult;

public class AntiCaptchaTask extends AntiCaptchaBase {

    public AntiCaptchaTask(String clientKey, int softId) {
        super(clientKey, softId);
    }

    public AntiCaptchaTask(String clientKey) {
        super(clientKey);
    }

    public TaskResult createTask(int maxSecTimeout) {
        TaskResult taskResult = query(TaskResult.class);
        if(taskResult.getErrorId() == 0) {
            return getTaskResult(taskResult.getTaskId(), maxSecTimeout);
        }
        return taskResult;
    }

    public TaskResult getTaskResult(int taskId, int maxSecTimeout) {
        TaskResultRequest resultRequest = new TaskResultRequest(clientKey, taskId, softId);
        TaskResult result = null;
        for(int i = 0; i <= maxSecTimeout; i += 3) {
            result = resultRequest.query(TaskResult.class);
            if(result.getStatus().equals(TaskResult.Response.READY.toString().toLowerCase())) {
                result.setReportInfo(clientKey, taskId);
                break;
            } else {
                waitSec(3);
            }
        }
        return result;
    }

    private void waitSec(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getUrl() {
        return "https://api.anti-captcha.com/createTask";
    }
}
