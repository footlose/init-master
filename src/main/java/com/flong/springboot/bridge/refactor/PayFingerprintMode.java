package com.flong.springboot.bridge.refactor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 4:04 下午
 */
@Slf4j
public class PayFingerprintMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        log.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
