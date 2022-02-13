package com.flong.springboot.visitor.matter.visitor.impl;

import com.flong.springboot.visitor.matter.user.impl.Student;
import com.flong.springboot.visitor.matter.user.impl.Teacher;
import com.flong.springboot.visitor.matter.visitor.Visitor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wangshuai
 * @version 1.0
 * @description 家长
 * @date 2022/1/26 10:31 PM
 */
@Slf4j
public class Parent implements Visitor {
    @Override
    public void visit(Student student) {
        log.info("学生信息 姓名：{} 班级：{} 排名：{}", student.name, student.clazz, student.ranking());
    }

    @Override
    public void visit(Teacher teacher) {
        log.info("老师信息 姓名：{} 班级：{} 级别：{}", teacher.name, teacher.clazz, teacher.identity);
    }
}
