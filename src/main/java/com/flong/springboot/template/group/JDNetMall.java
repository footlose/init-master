package com.flong.springboot.template.group;

import com.alibaba.fastjson.JSON;
import com.flong.springboot.template.NetMall;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/24 9:08 PM
 */
@Slf4j
public class JDNetMall extends NetMall {

    public JDNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected boolean login(String uId, String uPwd) {
        log.info("模拟JD用户登录 uId：{} uPwd：{}", uId, uPwd);
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("name", "iphone");
        map.put("price", "5999.00");
        log.info("模拟京东商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        log.info("模拟生成京东商品base64海报");
        return JSON.toJSONString(goodsInfo);
    }
}
