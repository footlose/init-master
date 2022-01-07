package com.flong.springboot.abstractFactory.echarts;

import org.springframework.beans.BeansException;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 9:29 上午
 */
public class DefaultEchartsFactory extends EchartsFactory {


    @Override
    public AbstractBarSimple createBarSimple(Map<String, Object> parameters, Class<?> cls) {
        return (AbstractBarSimple) getBeanInstance(cls, parameters);
    }

    @Override
    public AbstractLineSimple createLineSimple(Map<String, Object> parameters, Class<?> cls) {
        return (AbstractLineSimple) getBeanInstance(cls, parameters);
    }


    @SuppressWarnings("unchecked")
    public static <T> T getBeanInstance(Class<T> cls, Map<String, Object> parameters) throws BeansException {
        try {
            /**
             * 如果使用反射newInstance()之后 cls实现类springIOC容器失效 所以从SpringIOC容器中获取该实例
             */
//            Object obj = SpringContextUtil.getBean(cls.getName());
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method method = cls.getDeclaredMethod("setParameters", new Class[]{Map.class});
            method.setAccessible(true);
            method.invoke(obj, parameters);
            return (T) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
