package com.flong.springboot.strategy.refactor.event;

import com.flong.springboot.strategy.refactor.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author wangshuai
 * @version 1.0
 * @description 直减
 * @date 2022/1/24 8:56 PM
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {

    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;
        return discountAmount;
    }
}
