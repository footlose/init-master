package com.flong.springboot.composite.refactor.model.vo;

import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description 树节点链接链路
 * @date 2021/10/22 9:32 上午
 */
@Data
public class TreeNodeLink {

    //节点From
    private Long nodeIdFrom;
    //节点To
    private Long nodeIdTo;
    //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
    private Integer ruleLimitType;
    //限定值
    private String ruleLimitValue;


}
