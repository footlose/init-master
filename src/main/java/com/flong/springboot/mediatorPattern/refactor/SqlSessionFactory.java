package com.flong.springboot.mediatorPattern.refactor;

/**
 * @author wangshuai
 * @version 1.0
 * @description 定义SqlSessionFactory接口
 * @date 2022/1/17 8:54 PM
 */
public interface SqlSessionFactory {

    SqlSession openSession();
}
