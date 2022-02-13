package com.flong.springboot.state.refactor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/24 7:49 PM
 */
@Data
@AllArgsConstructor
public class Result {
    private String code;
    private String description;
}
