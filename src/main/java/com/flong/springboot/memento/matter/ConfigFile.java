package com.flong.springboot.memento.matter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description 配置信息类
 * @date 2022/1/19 4:52 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigFile {
    // 版本号
    private String versionNo;
    // 内容
    private String content;
    // 时间
    private Date dateTime;
    // 操作人
    private String operator;
}
