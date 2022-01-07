package com.flong.springboot.abstractFactory.echarts;

import com.flong.springboot.abstractFactory.echarts.dto.BarSimple;
import com.flong.springboot.abstractFactory.echarts.dto.LineSimple;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 11:01 上午
 */
public abstract class AbstractSimpleBean {

    private final EchartsFactory echartsFactory = new DefaultEchartsFactory();

    protected BarSimple getBarSimple() {
        Map<String, Object> conditionMap = this.getBarSimpleConditionMap();
        return echartsFactory.createBarSimple(conditionMap, BarSimpleImpl.class).initEchartsData();
    }

    protected LineSimple getLineSimple() {
        Map<String, Object> conditionMap = this.getLineSimpleConditionMap();
        AbstractLineSimple createLineSimple = echartsFactory.createLineSimple(conditionMap, LineSimpleImpl.class);
        return createLineSimple.initEchartsData();
    }

    /**
     * 提供key
     *
     * @return
     * @author wangshuai
     * @date 2021/10/18 11:30 上午
     */
    abstract Map<String, Object> getBarSimpleConditionMap();

    /**
     * 提供key
     *
     * @return
     * @author wangshuai
     * @date 2021/10/18 11:30 上午
     */
    abstract Map<String, Object> getLineSimpleConditionMap();
}
