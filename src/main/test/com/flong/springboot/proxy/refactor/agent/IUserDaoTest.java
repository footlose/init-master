package com.flong.springboot.proxy.refactor.agent;

import com.flong.springboot.Application;
import com.flong.springboot.proxy.refactor.IUserDao;
import com.flong.springboot.proxy.refactor.IUserDao2;
import com.flong.springboot.task.Config;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * RegisterBeanFactory Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>11月 12, 2021</pre>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IUserDaoTest {

    @Autowired
    private Config config;


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

    @Test
    public void testPostProcessBeanDefinitionRegistry2() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao2 userDao = beanFactory.getBean("userDao", IUserDao2.class);
        String res = userDao.queryUserInfo2("100001");
        log.info("测试结果：{}", res);
    }

    @Test
    public void getBean() {
        config.getBean2();
    }


}
