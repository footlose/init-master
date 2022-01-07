package com.flong.springboot.adapter.matter;

import lombok.Data;

import java.time.ZonedDateTime;

/**
 * @author wangshuai
 * @version 1.0
 * @description 注册开户MQ
 * @date 2021/10/21 2:20 下午
 */
@Data
public class CreateAccount {

    private String number;      // 开户编号
    private String address;     // 开户地
    private ZonedDateTime accountDate;   // 开户时间
    private String desc;        // 开户描述

}
