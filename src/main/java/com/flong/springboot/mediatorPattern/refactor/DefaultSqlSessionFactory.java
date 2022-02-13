package com.flong.springboot.mediatorPattern.refactor;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 8:55 PM
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.connection, configuration.mapperElement);
    }
}
