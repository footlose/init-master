package com.flong.springboot.flyweight.refactor;

import com.flong.springboot.flyweight.matter.Activity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description 享元工厂
 * @date 2021/10/31 6:09 下午
 */
public class ActivityFactory {

    static Map<Long, Activity> activityMap = new HashMap<>();


    public static Activity getActivity(Long id) {
        Activity activity = activityMap.get(id);
        if (null == activity) {
            // 模拟从实际业务应⽤用从接⼝口中获取活动信息
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("图书嗨乐");
            activity.setDesc("图书优惠券分享激励分享活动第⼆二期");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id, activity);
        }
        return activity;
    }
}
