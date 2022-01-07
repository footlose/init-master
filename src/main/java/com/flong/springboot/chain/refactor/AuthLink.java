package com.flong.springboot.chain.refactor;

import com.flong.springboot.chain.matter.AuthInfo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/13 5:12 下午
 */
public abstract class AuthLink {

    // 时间格式化
    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // 级别人员ID
    protected String levelUserId;
    // 级别人员姓名
    protected String levelUserName;
    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
