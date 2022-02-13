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
public class DangDangNetMall extends NetMall {
    public DangDangNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected boolean login(String uId, String uPwd) {
        log.info("模拟DD用户登录 uId：{} uPwd：{}", uId, uPwd);
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("name", "架构整洁之道");
        map.put("price", "39.00");
        log.info("模拟当当商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        log.info("模拟生成当当商品base64海报");
        return JSON.toJSONString(goodsInfo);
    }
}
