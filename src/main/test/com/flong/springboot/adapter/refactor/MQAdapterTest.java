package com.flong.springboot.adapter.refactor;

import com.alibaba.fastjson.JSON;
import com.flong.springboot.adapter.matter.CreateAccount;
import com.flong.springboot.adapter.matter.OrderMq;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.util.HashMap;

/**
 * MQAdapter Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10月 21, 2021</pre>
 */
@Slf4j
public class MQAdapterTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: filter(String strJson, Map<String, String> link)
     */
    @Test
    public void testFilterForStrJsonLink() throws Exception {

        CreateAccount createAccount = new CreateAccount();
        createAccount.setNumber("100001");
        createAccount.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        createAccount.setAccountDate(ZonedDateTime.now());
        createAccount.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<>();
        link01.put("userId", "number");
        link01.put("bizId", "address");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        String o = JSON.toJSONString(createAccount);
        RabbitInfo rebateInfo01 = MQAdapter.filter(o,  link01);
        System.out.println("mq.createAccount(适配前)" + JSON.toJSONString(createAccount));
        System.out.println("mq.createAccount(适配后)" + JSON.toJSONString(rebateInfo01));

        System.out.println("");

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(ZonedDateTime.now());

        HashMap<String, String> link02 = new HashMap<>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RabbitInfo rebateInfo02 = MQAdapter.filter(JSON.toJSONString(orderMq), link02);

        System.out.println("mq.orderMq(适配前)" + JSON.toJSONString(createAccount));
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));

    }

    /**
     * Method: filter(Map obj, Map<String, String> link)
     */
    @Test
    public void testFilterForObjLink() throws Exception {
//TODO: Test goes here... 
    }


} 
