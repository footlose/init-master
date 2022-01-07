package com.flong.springboot.adapter.refactor;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 2:32 下午
 */
public class MQAdapter {


    /**
     * @param strJson 实体类json序列化
     * @param link    映射关系
     * @return
     * @author wangshuai
     * @date 2021/10/21 3:36 下午
     */
    public static RabbitInfo filter(String strJson, Map<String, String> link)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    /**
     * 调用反射进行set
     *
     * @param obj
     * @param link
     * @return
     * @author wangshuai
     * @date 2021/10/21 3:36 下午
     */
    public static RabbitInfo filter(Map<String, Object> obj, Map<String, String> link)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RabbitInfo rebateInfo = new RabbitInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            String methodName = "set" + key.substring(0, 1).toUpperCase() + key.substring(1);
            RabbitInfo.class.getMethod(methodName, val.getClass()).invoke(rebateInfo, val);
        }
        return rebateInfo;
    }
}
