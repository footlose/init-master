package com.flong.springboot.factoryPattern.refactor.store;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/15 5:23 下午
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
