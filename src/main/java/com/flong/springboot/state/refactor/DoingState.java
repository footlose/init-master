package com.flong.springboot.state.refactor;

import com.flong.springboot.state.matter.ActivityService;
import com.flong.springboot.state.matter.Status;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/24 7:54 PM
 */
public class DoingState extends State {
    @Override
    public Result arraignment(String activityId, Status current) {
        ActivityService.execStatus(activityId, current, Status.Check);
        return new Result("0000", "活动提审成功");
    }

    @Override
    public Result checkPass(String activityId, Status current) {
        return new Result("0001", "编辑中不可审核通过");
    }

    @Override
    public Result checkRefuse(String activityId, Status current) {
        return new Result("0001", "编辑中不可审核拒绝");
    }

    @Override
    public Result checkRevoke(String activityId, Status current) {
        return new Result("0001", "编辑中不可撤销审核");
    }

    @Override
    public Result close(String activityId, Status current) {
        ActivityService.execStatus(activityId, current, Status.Close);
        return new Result("0000", "活动关闭成功");
    }

    @Override
    public Result open(String activityId, Status current) {
        return new Result("0001", "非关闭活动不可开启");
    }

    @Override
    public Result doing(String activityId, Status current) {
        return new Result("0001", "编辑中活动不可执行活动中变更");
    }
}
