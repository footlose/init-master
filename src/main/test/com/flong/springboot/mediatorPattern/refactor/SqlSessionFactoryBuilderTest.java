package com.flong.springboot.mediatorPattern.refactor;

import com.alibaba.fastjson.JSON;
import com.flong.springboot.Application;
import com.flong.springboot.mediatorPattern.matter.User;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.DocumentException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SqlSessionFactoryBuilderTest {

    @Autowired
    private SqlSessionFactoryBuilder sqlSessionFactoryBuilder;

    @Test
    public void build() throws DocumentException {
        DefaultSqlSessionFactory build = sqlSessionFactoryBuilder.build();
        log.info(build.toString());
    }

    @Test
    public void test_queryUserInfoById() throws DocumentException {
        DefaultSqlSessionFactory sqlMapper = sqlSessionFactoryBuilder.build();
        try {
            SqlSession session = sqlMapper.openSession();
            try {
                User user = session.selectOne("com.flong.springboot.mediatorPattern.matter.IDesignUserDao.queryUserInfoById", 1L);
                log.info("测试结果：{}", JSON.toJSONString(user));
            } finally {
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}