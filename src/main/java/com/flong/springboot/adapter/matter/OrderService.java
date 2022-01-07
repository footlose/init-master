package com.flong.springboot.adapter.matter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 2:22 下午
 */
@Slf4j
public class OrderService {

    /**
     * 查询用户内部下单数量接口
     *
     * @param userId
     * @return
     * @author wangshuai
     * @date 2021/10/21 2:23 下午
     */
    public long queryUserOrderCount(String userId) {
        log.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }
}
