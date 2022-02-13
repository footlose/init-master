package com.flong.springboot.memento.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description 记录者类
 * @date 2022/1/19 4:54 PM
 */
public class ConfigOriginator {

    private ConfigFile configFile;

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }

    /**
     * 保存备忘录的时候会创建一个备忘录信息，并返回回去，交给管理者处理。
     *
     * @return
     * @author wangshuai
     * @date 2022/1/19 4:55 PM
     */
    public ConfigMemento saveMemento() {
        return new ConfigMemento(configFile);
    }

    /**
     * 获取的之后并不是直接返回，而是把备忘录的信息交给现在的配置文件this.configFile
     *
     * @param memento
     * @return
     * @author wangshuai
     * @date 2022/1/19 4:55 PM
     */
    public void getMemento(ConfigMemento memento) {
        this.configFile = memento.getConfigFile();
    }

}
