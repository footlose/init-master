package com.flong.springboot.template;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description 抽象类
 * @date 2022/1/24 9:08 PM
 */
@Slf4j
public abstract class NetMall {
    String uId;
    String uPwd;

    public NetMall(String uId, String uPwd) {
        this.uId = uId;
        this.uPwd = uPwd;
    }

    public String generateGoodsPoster(String skuUrl) {
        if (!login(uId, uPwd)) {
            return null;
        }
        Map<String, String> result = reptile(skuUrl);
        return createBase64(result);
    }

    //登录
    protected abstract boolean login(String uId, String uPwd);

    //提取商品信息
    protected abstract Map<String, String> reptile(String skuUrl);

    //生成海报信息
    protected abstract String createBase64(Map<String, String> goodsInfo);

}
