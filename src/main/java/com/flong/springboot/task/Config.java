package com.flong.springboot.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/10 4:45 PM
 */
@Configuration
public class Config {

    @Autowired
    private ApplicationContext applicationContext;


    @Bean
    public TaskFactoryBean customTasks() {
        TaskFactoryBean taskFactoryBean = new TaskFactoryBean();
        taskFactoryBean.setCronExpression("0 15 10 * * ?");
        String name = "定时任务-1";
        CustomTaskService taskService = new CustomTaskService();
        taskService.setName(name);
        taskFactoryBean.setTaskService(taskService);
        return taskFactoryBean;
    }

    @Bean
    public TaskFactoryBean customTasks2() {
        TaskFactoryBean taskFactoryBean = new TaskFactoryBean();
        taskFactoryBean.setCronExpression("0 15 10 * * ?");
        String name = "定时任务-2";
        CustomTask2Service taskService2 = new CustomTask2Service();
        taskService2.setName(name);
        taskFactoryBean.setTaskService(taskService2);
        return taskFactoryBean;
    }

    public void getBean2() {
        CustomTask customTask = (CustomTask) applicationContext.getBean("customTasks");
        CustomTask customTasks2 = (CustomTask) applicationContext.getBean("customTasks2");
        customTask.execute();
        customTasks2.execute();
    }


}
