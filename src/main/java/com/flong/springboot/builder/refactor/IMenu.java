package com.flong.springboot.builder.refactor;

import com.flong.springboot.builder.matter.Matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 4:45 下午
 */
public interface IMenu {

    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter);    // 涂料

    IMenu appendFloor(Matter matter);   // 地板

    IMenu appendTile(Matter matter);    // 地砖

    String getDetail();                 // 明细

}
