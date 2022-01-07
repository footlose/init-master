package com.flong.springboot.bridge.refactor;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Pay Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10月 21, 2021</pre>
 */
@Slf4j
public class PayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testTransfer() throws Exception {

        PayHandler payHandler = new PayHandler();
        System.out.println("场景:微信支付、人脸方式。");
        payHandler.payTransfer(PayEnum.WX, PayModeEnum.Face, "weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("场景:支付宝支付、指纹方式。");
        payHandler.payTransfer(PayEnum.ZFB, PayModeEnum.Fingerprint, "jlu19dlxo111", "100000109894", new BigDecimal(100));

        System.out.println("场景:微信支付、密码方式。");
        payHandler.payTransfer(PayEnum.WX, PayModeEnum.Cypher, "weixin_1092033111", "100000109893", new BigDecimal(100));
    }


} 
