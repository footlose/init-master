package com.flong.springboot.state.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description 状态枚举
 * @date 2022/1/24 7:06 PM
 */
public enum Status {
    //创建编辑
    Editing,
    //待审核
    Check,
    //通过
    Pass,
    //审核拒绝
    Refuse,
    //活动中
    Doing,
    //活动关闭
    Close,
    //活动开启
    Open;
}
