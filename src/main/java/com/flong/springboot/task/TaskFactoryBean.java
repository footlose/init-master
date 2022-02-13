package com.flong.springboot.task;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/10 4:40 PM
 */
public class TaskFactoryBean implements FactoryBean<Task> {
    private TaskService taskService;
    private String cronExpression;

    @Override
    public Task getObject() {
        CustomTask customTask = new CustomTask(taskService);
        customTask.setCorn(cronExpression);
        return customTask;
    }

    @Override
    public Class<?> getObjectType() {
        return CustomTask.class;
    }

    public TaskService getTaskService() {
        return taskService;
    }

    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }
}
