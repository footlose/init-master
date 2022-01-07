package com.flong.springboot.flyweight.matter;

import lombok.Data;

import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description 活动
 * @date 2021/10/31 6:06 下午
 */
@Data
public class Activity {

    private Long id; // 活动ID
    private String name; // 活动名称
    private String desc; // 活动描述
    private Date startTime; // 开始时间
    private Date stopTime; // 结束时间
    private Stock stock; // 活动库存

}
