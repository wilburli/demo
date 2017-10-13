package com.inforun.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: wilburli
 * @Description:
 * @Date: Created by sh on 2017/10/12.
 */
@ConfigurationProperties(prefix = "quartz.config")
public class QuartzConfigProperties {
    private String targetObject;

    private String targetMethod;

    private boolean concurrent;

    private String cronExpression;

    private String applicationContextSchedulerContextKey;

    private boolean waitForJobsToCompleteOnShutdown;

    public String getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(String targetObject) {
        this.targetObject = targetObject;
    }

    public String getTargetMethod() {
        return targetMethod;
    }

    public void setTargetMethod(String targetMethod) {
        this.targetMethod = targetMethod;
    }

    public boolean isConcurrent() {
        return concurrent;
    }

    public void setConcurrent(boolean concurrent) {
        this.concurrent = concurrent;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getApplicationContextSchedulerContextKey() {
        return applicationContextSchedulerContextKey;
    }

    public void setApplicationContextSchedulerContextKey(String applicationContextSchedulerContextKey) {
        this.applicationContextSchedulerContextKey = applicationContextSchedulerContextKey;
    }

    public boolean isWaitForJobsToCompleteOnShutdown() {
        return waitForJobsToCompleteOnShutdown;
    }

    public void setWaitForJobsToCompleteOnShutdown(boolean waitForJobsToCompleteOnShutdown) {
        this.waitForJobsToCompleteOnShutdown = waitForJobsToCompleteOnShutdown;
    }
}
