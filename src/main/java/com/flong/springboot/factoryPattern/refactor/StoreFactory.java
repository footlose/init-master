package com.flong.springboot.factoryPattern.refactor;

import com.flong.springboot.factoryPattern.refactor.store.ICommodity;
import com.flong.springboot.factoryPattern.refactor.store.impl.CardCommodityService;
import com.flong.springboot.factoryPattern.refactor.store.impl.CouponCommodityService;
import com.flong.springboot.factoryPattern.refactor.store.impl.GoodsCommodityService;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/15 5:23 下午
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }

}
