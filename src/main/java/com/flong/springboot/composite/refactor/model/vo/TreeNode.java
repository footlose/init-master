package com.flong.springboot.composite.refactor.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @author wangshuai
 * @version 1.0
 * @description 树节点；子叶节点、果实节点
 * @date 2021/10/22 9:32 上午
 */
@Data
public class TreeNode {
    //规则树ID
    private Long treeId;
    //规则树节点ID
    private Long treeNodeId;
    //节点类型；1子叶、2果实
    private Integer nodeType;
    //节点值[nodeType=2]；果实值
    private String nodeValue;
    //规则Key
    private String ruleKey;
    //规则描述
    private String ruleDesc;
    //节点链路
    private List<TreeNodeLink> treeNodeLinkList;
}
