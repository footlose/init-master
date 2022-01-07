package com.flong.springboot.adapter.refactor;

import com.flong.springboot.adapter.matter.OrderService;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 3:30 下午
 */
public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 0;
    }
}
