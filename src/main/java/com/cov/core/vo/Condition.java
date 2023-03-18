package com.cov.core.vo;

import com.cov.core.enums.JoinType;
import com.cov.core.enums.Operation;
import com.cov.core.enums.JoinType;
import com.cov.core.enums.Operation;
import lombok.Data;


/**
 * 查询条件
 */
@Data
public class Condition {
    /**
     * 字段名称
     */
    private String fieldName;
    /**
     * 操作符
     */
    private Operation operation;
    /**
     * 值
     */
    private String value;
    /**
     * 与下一条件连接方式
     */
    private JoinType joinType;
}