package com.flong.springboot.state.refactor;

import com.alibaba.fastjson.JSON;
import com.flong.springboot.state.matter.ActivityService;
import com.flong.springboot.state.matter.Status;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class StateHandlerTest {

    @Test
    public void arraignment() {

        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);
        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.arraignment(activityId, Status.Editing);
        log.info("测试结果(编辑中To提审活动)：{}", JSON.toJSONString(result));
        log.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }

    @Test
    public void checkPass() {
    }

    @Test
    public void checkRefuse() {
    }

    @Test
    public void checkRevoke() {
    }

    @Test
    public void close() {
    }

    @Test
    public void open() {
    }

    @Test
    public void doing() {
    }
}