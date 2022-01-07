package com.flong.springboot.composite.refactor.model.vo;

import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description 树根信息
 * @date 2021/10/22 9:32 上午
 */
@Data
public class TreeRoot {
    //规则树ID
    private Long treeId;
    //规则树根ID
    private Long treeRootNodeId;
    //规则树名称
    private String treeName;
}
