package com.flong.springboot.adapter.protogenesis;

import com.alibaba.fastjson.JSON;
import com.flong.springboot.adapter.matter.CreateAccount;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 2:24 下午
 */
public class CreateAccountMqService {

    public void onMessage(String message) {

        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);
        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }
}
