package com.flong.springboot.task;


/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/10 4:29 PM
 */
public class CustomTask implements Task {
    /**
     * 任务service
     */
    private final TaskService taskService;
    /**
     * corn表达式
     */
    private String cronExpression;

    public CustomTask(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void execute() {
        taskService.doTask();
    }

    @Override
    public void setCorn(String corn) {
        this.cronExpression = corn;
    }

    @Override
    public String getCorn() {
        return this.cronExpression;
    }
}
