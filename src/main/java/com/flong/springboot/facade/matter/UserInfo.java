package com.flong.springboot.facade.matter;

import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/28 8:21 上午
 */
@Data
public class UserInfo {

    private String code;
    private String info;

    private String name;
    private Integer age;
    private String address;

    public UserInfo() {

    }

    public UserInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public UserInfo(String name, Integer age, String address) {
        this.code = "0000";
        this.info = "success";
        this.name = name;
        this.age = age;
        this.address = address;
    }


}
