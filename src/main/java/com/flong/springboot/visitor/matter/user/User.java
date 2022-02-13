package com.flong.springboot.visitor.matter.user;

import com.flong.springboot.visitor.matter.visitor.Visitor;
import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/26 10:04 PM
 */
@Data
public abstract class User {
    // 姓名
    public String name;
    // 身份；重点班、普通班 | 特级教师、普通教师、实习教师
    public String identity;
    // 班级
    public String clazz;

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    // 核心访问方法
    public abstract void accept(Visitor visitor);
}
