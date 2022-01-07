package com.flong.springboot.adapter.matter;

import lombok.Data;

import java.time.ZonedDateTime;

/**
 * @author wangshuai
 * @version 1.0
 * @description 内部订单MQ
 * @date 2021/10/21 2:21 下午
 */
@Data
public class OrderMq {

    private String uid;           // 用户ID
    private String sku;           // 商品
    private String orderId;       // 订单ID
    private ZonedDateTime createOrderTime; // 下单时间

}
