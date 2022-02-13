package com.flong.springboot.chainPattern.refactor;

import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/12 5:40 PM
 */
@Data
public class AuthInfo {

    private String code;
    private String info = "";

    public AuthInfo(String code, String ...infos) {
        this.code = code;
        for (String str:infos){
            this.info = this.info.concat(str);
        }
    }

}
