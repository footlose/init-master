package com.flong.springboot.chain.refactor;

import com.alibaba.fastjson.JSON;
import com.flong.springboot.chain.matter.AuthInfo;
import com.flong.springboot.chain.matter.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Level3AuthLink Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>11月 13, 2021</pre>
 */
@Slf4j
public class Level3AuthLinkTest {

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

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化
        Date authDate = f.parse("2020-06-17 00:00:00");
        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNext(new Level2AuthLink("1000012", "张经理")
                        .appendNext(new Level1AuthLink("1000011", "段总")));
        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        log.info("测试结果：{}", "模拟三级负责人审批，王工");
        AuthInfo authInfo0 = authLink.doAuth("小傅哥", "1000998004813441", authDate);
        log.info("测试结果：{}", JSON.toJSONString(authInfo0));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        log.info("测试结果：{}", "模拟二级负责人审批，张经理");
        AuthInfo authInfo1 = authLink.doAuth("小傅哥", "1000998004813441", authDate);
        log.info("测试结果：{}", JSON.toJSONString(authInfo1));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        log.info("测试结果：{}", "模拟一级负责人审批，段总");
        AuthInfo authInfo2 = authLink.doAuth("小傅哥", "1000998004813441", authDate);
        log.info("测试结果：{}", JSON.toJSONString(authInfo2));

    }


} 
