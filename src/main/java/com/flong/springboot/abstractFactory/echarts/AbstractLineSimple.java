package com.flong.springboot.abstractFactory.echarts;

import com.flong.springboot.abstractFactory.echarts.dto.ExtMapData;
import com.flong.springboot.abstractFactory.echarts.dto.LineSimple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 9:31 上午
 */
public abstract class AbstractLineSimple extends BaseEchartsBean<LineSimple> {

    /**
     * 获取data数据集
     * name :x轴值集合
     * value :对应的y轴值集合
     * ExtMapData<name:value> 的List集合形式
     * @return
     */
    protected abstract List<ExtMapData<String, String>> listXYAxis();

    @Override
    public LineSimple initEchartsData() {
        LineSimple lineSimple = new LineSimple();
        List<String> xAxisDataList = new ArrayList<>();
        List<String> seriesDataList = new ArrayList<>();
        List<ExtMapData<String, String>> listData = listXYAxis();

        for (ExtMapData<String, String> extMapData : listData) {
            xAxisDataList.add(String.valueOf(extMapData.getName()));
            seriesDataList.add(String.valueOf(extMapData.getValue()));
        }

        lineSimple.setXAxisData(xAxisDataList);
        lineSimple.setSeriesData(seriesDataList);
        return lineSimple;
    }


}
