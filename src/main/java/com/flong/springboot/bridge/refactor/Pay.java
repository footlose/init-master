package com.flong.springboot.bridge.refactor;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 4:00 下午
 */
@Slf4j
public abstract class Pay {
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public Pay() {}

    public void setPayMode(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
