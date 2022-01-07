package com.flong.springboot.bridge.refactor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 4:05 下午
 */
@Slf4j
public class PayCypher implements IPayMode {
    @Override
    public boolean security(String uId) {
        log.info("密码支付，风控校验环境安全");
        return true;
    }
}
