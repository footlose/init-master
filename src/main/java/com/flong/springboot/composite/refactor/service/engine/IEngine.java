package com.flong.springboot.composite.refactor.service.engine;

import com.flong.springboot.composite.refactor.model.aggregates.TreeRich;
import com.flong.springboot.composite.refactor.model.vo.EngineResult;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/22 9:36 上午
 */
public interface IEngine {

    /**
     * 决策引擎接口定义
     * 对于使用方来说也同样需要定义统一的接口操作，这样的好处非常方便后续拓展出不同类型的决策引擎，也就是可以建造不同的决策工厂。
     *
     * @param treeId
     * @param userId
     * @param treeRich
     * @param decisionMatter
     * @return
     * @author wangshuai
     * @date 2021/10/22 10:07 上午
     */
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
