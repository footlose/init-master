package com.flong.springboot.state.refactor;

import com.flong.springboot.state.matter.Status;

/**
 * @author wangshuai
 * @version 1.0
 * @description 状态抽象类
 * @date 2022/1/24 7:48 PM
 */
public abstract class State {

    //活动提审
    public abstract Result arraignment(String activityId, Status current);

    //审核通过
    public abstract Result checkPass(String activityId, Status current);

    //审核拒绝
    public abstract Result checkRefuse(String activityId, Status current);

    //审核撤销
    public abstract Result checkRevoke(String activityId, Status current);

    //活动关闭
    public abstract Result close(String activityId, Status current);

    //活动开启
    public abstract Result open(String activityId, Status current);

    //活动执行
    public abstract Result doing(String activityId, Status current);


}
