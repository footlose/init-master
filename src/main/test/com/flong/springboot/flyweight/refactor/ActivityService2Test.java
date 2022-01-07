package com.flong.springboot.flyweight.refactor;

import com.alibaba.fastjson.JSON;
import com.flong.springboot.flyweight.matter.Activity;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ActivityService2 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10月 31, 2021</pre>
 */
@Slf4j
public class ActivityService2Test {


    private ActivityService2 activityService2 = new ActivityService2();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: queryActivityInfo(Long id)
     */
    @Test
    public void testQueryActivityInfo() throws Exception {

        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityService2.queryActivityInfo(req);
            log.info("测试结果：{} {}", req, JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }


} 
