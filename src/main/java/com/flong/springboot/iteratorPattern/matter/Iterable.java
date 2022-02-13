package com.flong.springboot.iteratorPattern.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 4:06 PM
 */
public interface Iterable<E> {

    /**
     * 在自己的数据结构中需要实现迭代器的功能并交给Iterable，由此让外部调用方进行获取使用。
     *
     * @return
     */
    Iterator<E> iterator();
}
