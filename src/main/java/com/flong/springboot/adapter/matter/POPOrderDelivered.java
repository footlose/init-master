package com.flong.springboot.adapter.matter;

import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * @author wangshuai
 * @version 1.0
 * @description 第三方订单MQ
 * @date 2021/10/21 2:21 下午
 */
@Data
public class POPOrderDelivered {

    // 用户ID
    private String uId;
    // 订单号
    private String orderId;
    // 下单时间
    private ZonedDateTime orderTime;
    // 商品
    private String sku;
    // 商品名称
    private String skuName;
    // 金额
    private BigDecimal decimal;

}
