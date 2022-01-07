package com.flong.springboot.adapter.refactor;

import com.flong.springboot.adapter.matter.POPOrderService;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 3:31 下午
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private final POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
