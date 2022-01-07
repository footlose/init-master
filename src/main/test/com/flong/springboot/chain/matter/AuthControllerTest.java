package com.flong.springboot.chain.matter;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * AuthController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>11月 13, 2021</pre>
 */
@Slf4j
public class AuthControllerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: doAuth(String uId, String orderId, Date authDate)
     */
    @Test
    public void testDoAuth() throws Exception {

        AuthController authController = new AuthController();

        // 模拟三级负责人审批
        log.info("测试结果：{}", JSON.toJSONString(authController.doAuth("小傅哥", "1000998004813441", "2020-06-02 00:00:00")));
        log.info("测试结果：{}", "模拟三级负责人审批，王工");
        AuthService.auth("1000013", "1000998004813441");
        AuthService.queryAuthInfo("1000013", "1000998004813441");
        log.info("测试结果：{}", JSON.toJSONString(authController.doAuth("小傅哥", "1000998004813441", "2020-06-02 00:00:00")));


        // 模拟二级负责人审批                                 
        log.info("测试结果：{}", JSON.toJSONString(authController.doAuth("小傅哥", "1000998004813442", "2020-06-09 00:00:00")));
        log.info("测试结果：{}", "模拟三级负责人审批，王工");
        AuthService.auth("1000013", "1000998004813442");
        log.info("测试结果：{}", JSON.toJSONString(authController.doAuth("小傅哥", "1000998004813442", "2020-06-09 00:00:00")));
        log.info("测试结果：{}", "模拟二级负责人审批，张经理");
        AuthService.auth("1000012", "1000998004813442");
        log.info("测试结果：{}", JSON.toJSONString(authController.doAuth("小傅哥", "1000998004813442", "2020-06-09 00:00:00")));


        // 模拟一级负责人审批
        log.info("测试结果：{}", JSON.toJSONString(authController.doAuth("小傅哥", "1000998004813443", "2020-06-17 00:00:00")));
        log.info("测试结果：{}", "模拟三级负责人审批，王工");
        AuthService.auth("1000013", "1000998004813443");
        log.info("测试结果：{}", JSON.toJSONString(authController.doAuth("小傅哥", "1000998004813443", "2020-06-17 00:00:00")));
        log.info("测试结果：{}", "模拟二级负责人审批，张经理");
        AuthService.auth("1000012", "1000998004813443");
        log.info("测试结果：{}", JSON.toJSONString(authController.doAuth("小傅哥", "1000998004813443", "2020-06-17 00:00:00")));
        log.info("测试结果：{}", "模拟一级负责人审批，段总");
        AuthService.auth("1000011", "1000998004813443");
        log.info("测试结果：{}", JSON.toJSONString(authController.doAuth("小傅哥", "1000998004813443", "2020-06-17 00:00:00")));


        log.info("测试结果：{}", "审批完成");
    }


} 
