package com.flong.springboot.memento.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description 备忘录类
 * @date 2022/1/19 4:53 PM
 */
public class ConfigMemento {

    private ConfigFile configFile;

    public ConfigMemento(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }


}
