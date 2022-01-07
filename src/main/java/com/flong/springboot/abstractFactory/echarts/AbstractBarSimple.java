package com.flong.springboot.abstractFactory.echarts;

import com.flong.springboot.abstractFactory.echarts.dto.BarSimple;
import com.flong.springboot.abstractFactory.echarts.dto.ExtMapData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 9:31 上午
 */
public abstract class AbstractBarSimple extends BaseEchartsBean<BarSimple> {

    protected abstract List<String> getLegendList();

    /**
     * 获取data数据集
     * name :x轴值集合
     * value :对应的y轴值集合
     * ExtMapData<name:value> 的List集合形式
     *
     * @return
     */
    protected abstract List<ExtMapData<String, String>> listXYAxis();

    @Override
    public BarSimple initEchartsData() {
        BarSimple barSimple = new BarSimple();
        List<String> legendList = getLegendList();
        List<ExtMapData<String, String>> listData = listXYAxis();
        List<String> xAxisDataList = new ArrayList<>();
        List<Object> serieDataList = new ArrayList<>();
        List<List<Object>> serieDataListSum = new ArrayList<>();

        for (ExtMapData<String, String> extMapData : listData) {
            xAxisDataList.add(String.valueOf(extMapData.getName()));
            serieDataList.add(String.valueOf(extMapData.getValue()));
        }

        barSimple.setLegendData(legendList);
        barSimple.setXAxisData(xAxisDataList);
        serieDataListSum.add(serieDataList);
        barSimple.setSeriesData(serieDataListSum);
        return barSimple;
    }

}
