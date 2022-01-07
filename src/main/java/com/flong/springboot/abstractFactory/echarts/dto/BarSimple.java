package com.flong.springboot.abstractFactory.echarts.dto;

import lombok.Data;

import java.util.List;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 10:23 上午
 */
@Data
public class BarSimple {

    private List<String> legendData;
    private List<String> xAxisData;
    private List<String> yAxisData;
    private List<List<Object>> seriesData;

}