package com.flong.springboot.composite.refactor.service.engine;

import com.flong.springboot.composite.refactor.service.logic.LogicFilter;
import com.flong.springboot.composite.refactor.service.logic.impl.UserAgeFilter;
import com.flong.springboot.composite.refactor.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 决策节点配置
 *
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/22 9:36 上午
 */
public class EngineConfig {

    private static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        EngineConfig.logicFilterMap = logicFilterMap;
    }

}
