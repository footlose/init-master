package com.flong.springboot.link.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.flong.springboot.core.domain.Domain;

/**
 * @author : http://www.chiner.pro
 * @date : 2021-11-14
 * @desc : 节点条件表
 */
@TableName("node_condition")
public class NodeCondition extends Domain {

    /**
     * 节点ID
     */
    private Long nodeId;
    /**
     * 条件名称
     */
    private String conditionName;
    /**
     * 条件内容
     */
    private String conditionValue;
}