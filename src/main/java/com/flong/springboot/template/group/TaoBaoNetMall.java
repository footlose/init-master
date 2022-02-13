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
 * @date 2022/1/24 9:09 PM
 */
@Slf4j
public class TaoBaoNetMall extends NetMall {
    public TaoBaoNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected boolean login(String uId, String uPwd) {
        log.info("模拟TB用户登录 uId：{} uPwd：{}", uId, uPwd);
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("name", "iphone12x");
        map.put("price", "4500.00");
        log.info("模拟淘宝商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        log.info("模拟生成淘宝商品base64海报");
        return JSON.toJSONString(goodsInfo);
    }
}
