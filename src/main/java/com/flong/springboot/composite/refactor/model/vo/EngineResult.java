package com.flong.springboot.composite.refactor.model.vo;

import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description 决策返回对象信息
 * @date 2021/10/22 9:31 上午
 */
@Data
public class EngineResult {

    //执行结果
    private boolean isSuccess;
    //用户ID
    private String userId;
    //规则树ID
    private Long treeId;
    //果实节点ID
    private Long nodeId;
    //果实节点值
    private String nodeValue;

    public EngineResult() {
    }

    public EngineResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

}
