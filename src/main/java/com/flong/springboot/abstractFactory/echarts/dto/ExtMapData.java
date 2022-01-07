package com.flong.springboot.abstractFactory.echarts.dto;

import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 10:43 上午
 */
@Data
public class ExtMapData<K, V> {
    private K name;
    private V value;
}
