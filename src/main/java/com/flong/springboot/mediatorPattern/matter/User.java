package com.flong.springboot.mediatorPattern.matter;

import lombok.Data;

import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 9:11 PM
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private Date createTime;
    private Date updateTime;

}
