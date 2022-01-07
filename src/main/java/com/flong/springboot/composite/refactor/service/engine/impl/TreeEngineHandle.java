package com.flong.springboot.composite.refactor.service.engine.impl;

import com.flong.springboot.composite.refactor.model.aggregates.TreeRich;
import com.flong.springboot.composite.refactor.model.vo.EngineResult;
import com.flong.springboot.composite.refactor.model.vo.TreeNode;
import com.flong.springboot.composite.refactor.service.engine.EngineBase;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description 通过传递进来的必要信息；决策树信息、决策物料值，来做具体的树形结构决策。
 * @date 2021/10/22 9:36 上午
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
