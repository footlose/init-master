package com.flong.springboot.strategy.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/24 8:40 PM
 */
public class CouponDiscountService {
    /**
     * 优惠券折扣计算接口
     * <p>
     * 优惠券类型；
     * 1. 直减券
     * 2. 满减券
     * 3. 折扣券
     * 4. n元购
     */
    public double discountAmount(int type, double typeContent, double skuPrice, double typeExt) {
        // 1. 直减券
        if (1 == type) {
            return skuPrice - typeContent;
        }
        // 2. 满减券
        if (2 == type) {
            if (skuPrice < typeExt) return skuPrice;
            return skuPrice - typeContent;
        }
        // 3. 折扣券
        if (3 == type) {
            return skuPrice * typeContent;
        }
        // 4. n元购
        if (4 == type) {
            return typeContent;
        }
        return 0D;
    }
}
