package com.flong.springboot.flyweight.matter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description 库存
 * @date 2021/10/31 6:08 下午
 */
@Data
@AllArgsConstructor
public class Stock {

    private int total; // 库存总量量
    private int used; // 库存已⽤用


}
