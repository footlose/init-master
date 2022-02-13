package com.flong.springboot.proxy.refactor.agent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/9 10:17 下午
 */
@Slf4j
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() {
        InvocationHandler handler = (proxy, method, args) -> {
            Select select = method.getAnnotation(Select.class);
            log.info("SQL:{}", select.value().replace("#{uId}", args[0].toString()));
            return args[0] + "vita is good";
        };
        //newProxyInstance，方法有三个参数：
        //loader: 用哪个类加载器去加载代理对象
        //interfaces:动态代理类需要实现的接口
        //h:动态代理方法在执行时，会调用h里面的invoke方法去执行
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }


}
