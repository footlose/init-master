package com.flong.springboot.abstractFactory.refactor.factory;

import com.flong.springboot.abstractFactory.refactor.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangshuai
 * @version 1.0
 * @description 代理类，同时对于使用哪个集群有外部通过入参进行传递
 * @date 2021/10/17 10:24 下午
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Class<?>[] clazzByArgs = ClassLoaderUtils.getClazzByArgs(args);
        method = ICacheAdapter.class.getMethod(methodName, clazzByArgs);
        return method.invoke(cacheAdapter, args);
    }


}
