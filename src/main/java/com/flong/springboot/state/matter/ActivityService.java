package com.flong.springboot.state.matter;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description 活动服务
 * @date 2022/1/24 7:06 PM
 */
@Service
public class ActivityService {

    private static Map<String, Status> statusMap = new HashMap<>();

    public static void init(String activityId, Status status) {
        //模拟查询活动信息
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setActivityId(activityId);
        activityInfo.setActivityName("早起学习打卡活动");
        activityInfo.setStatus(status);
        activityInfo.setBeginTime(new Date());
        activityInfo.setEndTime(new Date());
        statusMap.put(activityId, status);
    }

    /**
     * 查询活动信息
     *
     * @param activityId 活动ID
     * @return 查询结果
     */
    public static ActivityInfo queryActivityInfo(String activityId) {
        // 模拟查询活动信息
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setActivityId(activityId);
        activityInfo.setActivityName("早起学习打卡领奖活动");
        //通过map获取
        activityInfo.setStatus(statusMap.get(activityId));
        activityInfo.setBeginTime(new Date());
        activityInfo.setEndTime(new Date());
        return activityInfo;
    }


    /**
     * 查询活动状态
     *
     * @param activityId 活动ID
     * @return 查询结果
     */
    public static Status queryActivityStatus(String activityId) {
        return statusMap.get(activityId);
    }

    /**
     * 执行状态变更
     *
     * @param activityId   活动ID
     * @param beforeStatus 变更前状态
     * @param afterStatus  变更后状态 b
     */
    public static synchronized void execStatus(String activityId, Status beforeStatus, Status afterStatus) {

//  活动状态变更
//  1. 编辑中 -> 提审、关闭
//  2. 审核通过 -> 拒绝、关闭、活动中
//  3. 审核拒绝 -> 撤审、关闭
//  4. 活动中 -> 关闭
//  5. 活动关闭 -> 开启
//  6. 活动开启 -> 关闭
        if (!beforeStatus.equals(statusMap.get(activityId))) {
            return;
        }
        statusMap.put(activityId, afterStatus);
    }


}
