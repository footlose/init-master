package com.flong.springboot.adapter.refactor;

import lombok.Data;

import java.time.ZonedDateTime;

/**
 * @author wangshuai
 * @version 1.0
 * @description 统一消息体
 * @date 2021/10/21 2:26 下午
 */
@Data
public class RabbitInfo {

    private String userId;  // 用户ID
    private String bizId;   // 业务ID
    private ZonedDateTime bizTime;// 业务时间
    private String desc;    // 业务描述

    public void setBizTime(String bizTime) {
        ZonedDateTime parse = ZonedDateTime.parse(bizTime);
        this.bizTime = parse;
    }

}
