package com.flong.springboot.observer.refactor;

import lombok.Data;

import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/21 4:22 PM
 */
@Data
public class LotteryResult {
    private String uId;
    private String lottery;
    private Date date;
    private String msg;

    public LotteryResult(String uId, String lottery, Date date, String msg) {
        this.uId = uId;
        this.lottery = lottery;
        this.date = date;
        this.msg = msg;
    }
}
