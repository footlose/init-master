package com.flong.springboot.abstractFactory.echarts;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 9:28 上午
 */
public abstract class EchartsFactory {

    /**
     *
     *
     * @param parameters
     * @param cls
     * @return
     * @author wangshuai 
     * @date 2021/10/18 2:19 下午    
     */
    public abstract AbstractBarSimple createBarSimple(Map<String, Object> parameters, Class<?> cls);

    /**
     *
     *
     * @param parameters
     * @param cls
     * @return
     * @author wangshuai 
     * @date 2021/10/18 2:19 下午    
     */
    public abstract AbstractLineSimple createLineSimple(Map<String, Object> parameters, Class<?> cls);

}
