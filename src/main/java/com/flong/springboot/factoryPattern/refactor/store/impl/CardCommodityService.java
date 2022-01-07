package com.flong.springboot.factoryPattern.refactor.store.impl;

import com.alibaba.fastjson.JSON;
import com.flong.springboot.factoryPattern.protogenesis.card.IQiYiCardService;
import com.flong.springboot.factoryPattern.refactor.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/15 5:23 下午
 */
@Slf4j
public class CardCommodityService implements ICommodity {

    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        log.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
