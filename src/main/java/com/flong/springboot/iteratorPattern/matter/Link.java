package com.flong.springboot.iteratorPattern.matter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description 树节点链路
 * @date 2022/1/17 4:04 PM
 */
@Data
@AllArgsConstructor
public class Link {
    // 雇员ID
    private String fromId;
    // 雇员ID
    private String toId;
}
