package com.flong.springboot.builder.refactor;

import com.flong.springboot.builder.matter.ceiling.LevelOneCeiling;
import com.flong.springboot.builder.matter.ceiling.LevelTwoCeiling;
import com.flong.springboot.builder.matter.coat.DuluxCoat;
import com.flong.springboot.builder.matter.coat.LiBangCoat;
import com.flong.springboot.builder.matter.floor.ShengXiangFloor;
import com.flong.springboot.builder.matter.tile.DongPengTile;
import com.flong.springboot.builder.matter.tile.MarcoPoloTile;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/18 4:50 下午
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }

}
