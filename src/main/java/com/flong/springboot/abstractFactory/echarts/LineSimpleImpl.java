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
 * @date 2021/10/18 10:49 上午
 */
@Slf4j
public class LineSimpleImpl extends AbstractLineSimple{

    @Override
    protected void setParameters(Map<String, Object> parameters) {
        super.parameters = parameters;
    }

    @Override
    protected List<ExtMapData<String, String>> listXYAxis() {
        log.info("param[{}]", this.parameters);
        List<ExtMapData<String, String>> list = new ArrayList<>();
        ExtMapData<String, String> extMapData = new ExtMapData<>();
        extMapData.setName("周俊影");
        extMapData.setValue("B");
        list.add(extMapData);
        return list;
    }
}
