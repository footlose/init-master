package com.flong.springboot.decorator.refactor;

import com.flong.springboot.decorator.matter.SsoInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * LoginSsoDecorator Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10月 22, 2021</pre>
 */
@Slf4j
public class LoginSsoDecoratorTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: preHandle(String request, String response, Object handler)
     */
    @Test
    public void testPreHandle() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }


} 
