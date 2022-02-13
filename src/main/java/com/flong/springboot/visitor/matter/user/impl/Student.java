package com.flong.springboot.visitor.matter.user.impl;

import com.flong.springboot.visitor.matter.user.User;
import com.flong.springboot.visitor.matter.visitor.Visitor;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/26 10:04 PM
 */
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //排名
    public int ranking() {
        return (int) (Math.random() * 100);
    }

}
