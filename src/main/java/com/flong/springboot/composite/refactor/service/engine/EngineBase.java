package com.flong.springboot.composite.refactor.service.engine;

import com.flong.springboot.composite.refactor.model.aggregates.TreeRich;
import com.flong.springboot.composite.refactor.model.vo.EngineResult;
import com.flong.springboot.composite.refactor.model.vo.TreeNode;
import com.flong.springboot.composite.refactor.model.vo.TreeRoot;
import com.flong.springboot.composite.refactor.service.logic.LogicFilter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/22 9:36 上午
 */
@Slf4j
public abstract class EngineBase extends EngineConfig implements IEngine {

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    /**
     * @param treeRich
     * @param treeId
     * @param userId
     * @param decisionMatter
     * @return
     * @author wangshuai
     * @date 2021/10/22 10:15 上午
     */
    protected TreeNode engineDecisionMaker(TreeRich treeRich,
                                           Long treeId,
                                           String userId,
                                           Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        //节点类型[NodeType]；1子叶、2果实
        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = getLogicFilterMap().get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            log.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }


}
