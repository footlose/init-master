package com.flong.springboot.memento.matter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangshuai
 * @version 1.0
 * @description 管理员类
 * @date 2022/1/19 4:55 PM
 */
public class Admin {

    //当前版本
    private int cursorIdx = 0;
    //configMemento 仓库
    private List<ConfigMemento> mementoList = new ArrayList<>();
    //key versionNumber value configMemento
    private Map<String, ConfigMemento> mementoMap = new ConcurrentHashMap<>();


    public void append(ConfigMemento memento) {
        mementoList.add(memento);
        mementoMap.put(memento.getConfigFile().getVersionNo(), memento);
        cursorIdx++;
    }

    /**
     * 回滚
     *
     * @return
     * @author wangshuai
     * @date 2022/1/19 5:01 PM
     */
    public ConfigMemento undo() {
        if (--cursorIdx <= 1) {
            return mementoList.get(0);
        }
        return mementoList.get(cursorIdx - 1);
    }

    /**
     * 新增版本
     *
     * @return
     * @author wangshuai
     * @date 2022/1/19 5:01 PM
     */
    public ConfigMemento redo() {
        if (++cursorIdx > mementoList.size()) {
            return mementoList.get(mementoList.size() - 1);
        }
        return mementoList.get(cursorIdx-1);
    }

    /**
     * 获取指定版本的配置
     *
     * @param versionNo
     * @return
     * @author wangshuai
     * @date 2022/1/19 5:01 PM
     */
    public ConfigMemento get(String versionNo) {
        return mementoMap.get(versionNo);
    }


}
