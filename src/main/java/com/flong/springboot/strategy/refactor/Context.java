package com.flong.springboot.strategy.refactor;

import java.math.BigDecimal;

/**
 * @author wangshuai
 * @version 1.0
 * @description 策略控制类
 * @date 2022/1/24 8:55 PM
 */
public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }

}
