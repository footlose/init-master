package com.flong.springboot.composite.refactor.model.aggregates;

import com.flong.springboot.composite.refactor.model.vo.TreeNode;
import com.flong.springboot.composite.refactor.model.vo.TreeRoot;
import lombok.Data;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description 聚合对象，包含组织树信息
 * @date 2021/10/22 9:31 上午
 */
@Data
public class TreeRich {
    //树根信息
    private TreeRoot treeRoot;
    //树节点ID -> 子节点
    private Map<Long, TreeNode> treeNodeMap;

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }


}
