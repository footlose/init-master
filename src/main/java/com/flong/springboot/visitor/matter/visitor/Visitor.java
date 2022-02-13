package com.flong.springboot.visitor.matter.visitor;

import com.flong.springboot.visitor.matter.user.impl.Student;
import com.flong.springboot.visitor.matter.user.impl.Teacher;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/26 10:31 PM
 */
public interface Visitor {

    // 访问学生信息
    void visit(Student student);

    // 访问老师信息
    void visit(Teacher teacher);
}
