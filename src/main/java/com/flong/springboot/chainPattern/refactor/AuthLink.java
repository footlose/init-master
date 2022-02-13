package com.flong.springboot.chainPattern.refactor;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/12 5:40 PM
 */
@Slf4j
@Data
public abstract class AuthLink {

    // 时间格式化
    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // 级别人员ID
    protected String levelUserId;
    // 级别人员姓名
    protected String levelUserName;
    // 下一个链
    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink getNext() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);


}
