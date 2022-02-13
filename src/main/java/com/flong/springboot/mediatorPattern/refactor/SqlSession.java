package com.flong.springboot.mediatorPattern.refactor;

import java.util.List;

/**
 * @author wangshuai
 * @version 1.0
 * @description 定义对数据库操作的查询接口
 * @date 2022/1/17 8:46 PM
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}
