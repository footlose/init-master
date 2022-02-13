package com.flong.springboot.strategy.refactor;

import java.math.BigDecimal;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/24 8:55 PM
 */
public interface ICouponDiscount<T> {

    /**
     * 优惠券金额计算
     *
     * @param couponInfo 折扣信息 直减 满减 折扣 N元购
     * @param skuPrice   sku金额
     * @return 优惠后金额
     * @author wangshuai
     * @date 2022/1/24 8:57 PM
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
