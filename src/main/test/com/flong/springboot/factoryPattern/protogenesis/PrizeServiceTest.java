package com.flong.springboot.factoryPattern.protogenesis;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/** 
* PrizeService Tester. 
* 
* @author <Authors name> 
* @since <pre>10月 15, 2021</pre> 
* @version 1.0 
*/
@Slf4j
public class PrizeServiceTest { 

@Before
public void before() {
} 

@After
public void after() {
} 

/** 
* 
* Method: awardToUser(AwardReq req) 
* 
*/ 
@Test
public void testAwardToUser() {

    PrizeService prizeController = new PrizeService();

    System.out.println("\r\n模拟发放优惠券测试\r\n");
    // 模拟发放优惠券测试
    AwardReq req01 = new AwardReq();
    req01.setuId("10001");
    req01.setAwardType(1);
    req01.setAwardNumber("EGM1023938910232121323432");
    req01.setBizId("791098764902132");
    AwardRes awardRes01 = prizeController.awardToUser(req01);

    log.info("请求参数：{}", JSON.toJSON(req01));
    log.info("测试结果：{}", JSON.toJSON(awardRes01));

    System.out.println("\r\n模拟方法实物商品\r\n");
    // 模拟方法实物商品
    AwardReq req02 = new AwardReq();
    req02.setuId("10001");
    req02.setAwardType(2);
    req02.setAwardNumber("9820198721311");
    req02.setBizId("1023000020112221113");
    req02.setExtMap(new HashMap<String, String>() {{
        put("consigneeUserName", "谢飞机");
        put("consigneeUserPhone", "15200292123");
        put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
    }});

    AwardRes awardRes02 = prizeController.awardToUser(req02);
    log.info("请求参数：{}", JSON.toJSON(req02));
    log.info("测试结果：{}", JSON.toJSON(awardRes02));

    System.out.println("\r\n第三方兑换卡(爱奇艺)\r\n");
    AwardReq req03 = new AwardReq();
    req03.setuId("10001");
    req03.setAwardType(3);
    req03.setAwardNumber("AQY1xjkUodl8LO975GdfrYUio");

    AwardRes awardRes03 = prizeController.awardToUser(req03);
    log.info("请求参数：{}", JSON.toJSON(req03));
    log.info("测试结果：{}", JSON.toJSON(awardRes03));

} 


/** 
* 
* Method: queryUserName(String uId) 
* 
*/ 
@Test
public void testQueryUserName() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = PrizeService.getClass().getMethod("queryUserName", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: queryUserPhoneNumber(String uId) 
* 
*/ 
@Test
public void testQueryUserPhoneNumber() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = PrizeService.getClass().getMethod("queryUserPhoneNumber", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
