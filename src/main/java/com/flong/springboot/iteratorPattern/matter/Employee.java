package com.flong.springboot.iteratorPattern.matter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description 雇员
 * @date 2022/1/17 4:03 PM
 */
@Data
@AllArgsConstructor
public class Employee {
    // ID
    private String uId;
    // 姓名
    private String name;
    // 备注
    private String desc;
}
