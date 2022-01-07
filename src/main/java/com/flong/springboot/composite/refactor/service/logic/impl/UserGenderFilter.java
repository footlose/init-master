package com.flong.springboot.composite.refactor.service.logic.impl;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description 性别节点
 * @date 2021/10/22 10:05 上午
 */
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }
}
