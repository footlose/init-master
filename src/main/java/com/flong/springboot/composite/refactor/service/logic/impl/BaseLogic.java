package com.flong.springboot.composite.refactor.service.logic.impl;

import com.flong.springboot.composite.refactor.model.vo.TreeNodeLink;
import com.flong.springboot.composite.refactor.service.logic.LogicFilter;

import java.util.List;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/22 9:37 上午
 */
public abstract class BaseLogic implements LogicFilter {

    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList) {
        for (TreeNodeLink nodeLine : treeNodeLineInfoList) {
            if (decisionLogic(matterValue, nodeLine)) {
                return nodeLine.getNodeIdTo();
            }
        }
        return 0L;
    }

    /**
     * 同时定义了抽象方法，让每一个实现接口的类都必须按照规则提供决策值，这个决策值用于做逻辑比对
     *
     * @param treeId
     * @param userId
     * @param decisionMatter
     * @return
     * @author wangshuai
     * @date 2021/10/22 9:49 上午
     */
    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);


    /**
     * 在抽象方法中实现了接口方法，同时定义了基本的决策方法；1、2、3、4、5，等于、小于、大于、小于等于、大于等于的判断逻辑。
     *
     * @param matterValue
     * @param nodeLink
     * @return
     * @author wangshuai
     * @date 2021/10/22 9:47 上午
     */
    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
