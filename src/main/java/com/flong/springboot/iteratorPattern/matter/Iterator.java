package com.flong.springboot.iteratorPattern.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description 迭代器定义
 * @date 2022/1/17 4:05 PM
 */
public interface Iterator<E> {

    /**
     * 判断是否有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return
     */
    E next();

}

