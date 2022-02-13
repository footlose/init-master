package com.flong.springboot.strategy.refactor.event;

import com.flong.springboot.strategy.refactor.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author wangshuai
 * @version 1.0
 * @description N元购
 * @date 2022/1/24 8:56 PM
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
