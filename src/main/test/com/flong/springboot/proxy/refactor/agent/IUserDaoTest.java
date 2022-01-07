package com.flong.springboot.proxy.refactor.agent;

import com.flong.springboot.proxy.refactor.IUserDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * RegisterBeanFactory Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>11月 12, 2021</pre>
 */
@Slf4j
public class IUserDaoTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry)
     */
    @Test
    public void testPostProcessBeanDefinitionRegistry() {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao = beanFactory.getBean("userDao", IUserDao.class);
        String res = userDao.queryUserInfo("100001");
        log.info("测试结果：{}", res);

    }




} 
