package com.flong.springboot.mediatorPattern.matter;

import lombok.Data;

import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 9:13 PM
 */
@Data
public class School {
    private Long id;
    private String name;
    private String address;
    private Date createTime;
    private Date updateTime;

}
