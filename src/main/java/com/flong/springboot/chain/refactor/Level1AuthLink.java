package com.flong.springboot.chain.refactor;

import com.flong.springboot.chain.matter.AuthInfo;
import com.flong.springboot.chain.matter.AuthService;

import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/13 5:21 下午
 */
public class Level1AuthLink extends AuthLink {
    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待一级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：审批完成负责人", " 时间：", f.format(date), " 审批人：", levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);
    }

    public Level1AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

}
