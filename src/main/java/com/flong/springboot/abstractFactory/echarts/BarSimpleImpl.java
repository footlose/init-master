package com.flong.springboot.abstractFactory.echarts;

import com.flong.springboot.abstractFactory.echarts.dto.ExtMapData;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 10:32 上午
 */
@Slf4j
public class BarSimpleImpl extends AbstractBarSimple {


    @Override
    protected void setParameters(Map<String, Object> parameters) {
        super.parameters = parameters;
    }

    @Override
    protected List<String> getLegendList() {
        List<String> legendList = new ArrayList<>();
        legendList.add("分数");
        return legendList;
    }

    @Override
    protected List<ExtMapData<String, String>> listXYAxis() {
        log.info("param[{}]", this.parameters);
        List<ExtMapData<String, String>> list = new ArrayList<>();
        ExtMapData<String, String> extMapData = new ExtMapData<>();
        extMapData.setName("王帅");
        extMapData.setValue("A");
        list.add(extMapData);
        return list;
    }
}
