package com.flong.springboot.visitor.matter.user.impl;


import com.flong.springboot.visitor.matter.user.User;
import com.flong.springboot.visitor.matter.visitor.Visitor;

import java.math.BigDecimal;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/26 10:04 PM
 */
public class Teacher extends User {

    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 升本率
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).
                setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
    }

}
