package com.flong.springboot.task;

public abstract class TaskService {

    String name = "";

    abstract void doTask();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
