package com.flong.springboot.prototype.refactor.util;

import lombok.Data;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/19 8:57 上午
 */
@Data
public class Topic {

    // 选项；A、B、C、D
    private Map<String, String> option;
    // 答案；B
    private String key;

    public Topic() {
    }

    public Topic(Map<String, String> option, String key) {
        this.key = key;
        this.option = option;
    }
}
