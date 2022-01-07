package com.flong.springboot.bridge.refactor;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 4:00 下午
 */
public interface IPayMode {

    /**
     * 判断是否支付安全
     *
     * @param uId
     * @return
     * @author wangshuai
     * @date 2021/10/21 4:38 下午
     */
    boolean security(String uId);
}
