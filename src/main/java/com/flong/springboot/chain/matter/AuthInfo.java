package com.flong.springboot.chain.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/13 4:12 下午
 */
public class AuthInfo {

    private String code;
    private String info = "";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            this.info = this.info.concat(str);
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
