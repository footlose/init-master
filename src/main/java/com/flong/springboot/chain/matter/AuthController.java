package com.flong.springboot.chain.matter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/13 4:12 下午
 */
public class AuthController {

    private SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化

    public AuthInfo doAuth(String uId, String orderId, String param) throws ParseException {

        Date authDate = f.parse(param);

        // 三级审批
        Date date = AuthService.queryAuthInfo("1000013", orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待三级审批负责人 ", "王工");
        }

        // 二级审批
        if (authDate.after(f.parse("2020-06-08 00:00:00")) && authDate.before(f.parse("2020-06-18 23:59:59"))) {
            date = AuthService.queryAuthInfo("1000012", orderId);
            if (null == date) {
                return new AuthInfo("0001", "单号：", orderId, " 状态：待二级审批负责人 ", "张经理");
            }
        }

        // 一级审批
        if (authDate.after(f.parse("2020-06-14 00:00:00")) && authDate.before(f.parse("2020-06-18 23:59:59"))) {
            date = AuthService.queryAuthInfo("1000011", orderId);
            if (null == date) {
                return new AuthInfo("0001", "单号：", orderId, " 状态：待一级审批负责人 ", "段总");
            }
        }

        return new AuthInfo("0001", "单号：", orderId, " 状态：审批完成");
    }

}
