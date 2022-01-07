package com.flong.springboot.facade.refactor.config;

import com.flong.springboot.core.util.StringUtils;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/28 8:29 上午
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }


}
