package com.flong.springboot.adapter.matter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 2:23 下午
 */
@Slf4j
public class POPOrderService {

    /**
     * 查询用户第三方下单首单接口
     *
     * @param uId
     * @return
     * @author wangshuai
     * @date 2021/10/21 2:23 下午
     */
    public boolean isFirstOrder(String uId) {
        log.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }
}
