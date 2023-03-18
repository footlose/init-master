package com.flong.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * SpringBoot & MyBatis Plus 整合
 *
 * @Author wangshuai
 * @Version V1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.flong.springboot"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
