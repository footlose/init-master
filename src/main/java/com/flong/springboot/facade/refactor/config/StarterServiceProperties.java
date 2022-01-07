package com.flong.springboot.facade.refactor.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/28 8:29 上午
 */
@Configuration
@ConfigurationProperties("itstack.door")
@Data
public class StarterServiceProperties {

    private String userStr;

}
