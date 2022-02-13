package com.flong.springboot.visitor.matter;

import com.flong.springboot.visitor.matter.user.User;
import com.flong.springboot.visitor.matter.user.impl.Student;
import com.flong.springboot.visitor.matter.user.impl.Teacher;
import com.flong.springboot.visitor.matter.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/26 10:32 PM
 */
public class DataView {

    List<User> userList = new ArrayList<>();

    public DataView() {
        userList.add(new Student("谢飞机", "重点班", "一年一班"));
        userList.add(new Student("windy", "重点班", "一年一班"));
        userList.add(new Student("大毛", "普通班", "二年三班"));
        userList.add(new Student("Shing", "普通班", "三年四班"));
        userList.add(new Teacher("BK", "特级教师", "一年一班"));
        userList.add(new Teacher("娜娜Goddess", "特级教师", "一年一班"));
        userList.add(new Teacher("dangdang", "普通教师", "二年三班"));
        userList.add(new Teacher("泽东", "实习教师", "三年四班"));
    }

    // 展示
    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }


}
