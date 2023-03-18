package com.cov.core.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 查询条件集合
 */
@Data
public class Conditions implements Serializable {
    /**
     * 查询条件列表
     */
    private List<Condition> conditionList;

}
