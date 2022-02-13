package com.flong.springboot.observer.refactor.event.listener;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/21 4:28 PM
 */
public interface EventListener<T> {

    /**
     * 执行动作
     *
     * @param result
     * @return
     * @author wangshuai
     * @date 2022/1/21 5:46 PM
     */
    void doEvent(T result);

}
