package com.flong.springboot.memento.matter;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Date;

@Slf4j
public class AdminTest {

    @Test
    public void append() {
        //管理员类
        Admin admin = new Admin();
        //记录者类
        ConfigOriginator configOriginator = new ConfigOriginator();
        //配置信息类
        ConfigFile A = new ConfigFile("1", "配置内容A", new Date(), "小傅哥");
        configOriginator.setConfigFile(A);
        admin.append(configOriginator.saveMemento()); // 保存配置
        ConfigFile B = new ConfigFile("2", "配置内容B", new Date(), "小傅哥");
        configOriginator.setConfigFile(B);
        admin.append(configOriginator.saveMemento()); // 保存配置
        ConfigFile C = new ConfigFile("3", "配置内容C", new Date(), "小傅哥");
        configOriginator.setConfigFile(C);
        admin.append(configOriginator.saveMemento()); // 保存配置
        ConfigFile D = new ConfigFile("4", "配置内容D", new Date(), "小傅哥");
        configOriginator.setConfigFile(D);
        admin.append(configOriginator.saveMemento()); // 保存配置

        log.info("当前版本{}", configOriginator.getConfigFile().getVersionNo());
        //备忘录类
        //回滚
        ConfigMemento undo = admin.undo();
        configOriginator.getMemento(undo);
        log.info("回滚");
        log.info("当前版本:{}", configOriginator.getConfigFile().getVersionNo());
        // 回滚
        configOriginator.getMemento(admin.undo());
        log.info("回滚");
        log.info("当前版本:{}", configOriginator.getConfigFile().getVersionNo());
        // 回滚
        configOriginator.getMemento(admin.undo());
        log.info("回滚");
        log.info("当前版本:{}", configOriginator.getConfigFile().getVersionNo());
        // 历史配置(前进)
        configOriginator.getMemento(admin.redo());
        log.info("前进");
        log.info("当前版本:{}", configOriginator.getConfigFile().getVersionNo());
        // 历史配置(获取)
        configOriginator.getMemento(admin.get("2"));
        log.info("获取-2");
        log.info("当前版本:{}", configOriginator.getConfigFile().getVersionNo());
    }

}