package com.flong.springboot.state.matter;

import lombok.Data;

import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description 活动对象
 * @date 2022/1/24 7:04 PM
 */
@Data
public class ActivityInfo {

    //活动ID
    private String activityId;

    //活动名称
    private String activityName;

    //活动状态
    private Status status;

    //开始时间
    private Date beginTime;

    //结束时间
    private Date endTime;

}
