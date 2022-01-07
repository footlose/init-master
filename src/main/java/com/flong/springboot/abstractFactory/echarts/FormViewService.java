package com.flong.springboot.abstractFactory.echarts;

import com.flong.springboot.abstractFactory.echarts.dto.BarSimple;
import com.flong.springboot.abstractFactory.echarts.dto.LineSimple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 10:56 上午
 */
public class FormViewService extends AbstractSimpleBean {


    @Override
    Map<String, Object> getBarSimpleConditionMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("王帅", "");
        map.put("庄茂辉", "");
        return map;
    }

    @Override
    Map<String, Object> getLineSimpleConditionMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("周俊影", "");
        return map;
    }

    protected BarSimple getBar() {
        return getBarSimple();
    }

    protected LineSimple getLine() {
        return getLineSimple();
    }


}
