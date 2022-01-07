package com.flong.springboot.abstractFactory.echarts;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 9:29 上午
 */
public abstract class BaseEchartsBean<T> {

    protected Map<String, Object> parameters;

    protected abstract void setParameters(Map<String, Object> parameters);

    protected abstract T initEchartsData();
}
