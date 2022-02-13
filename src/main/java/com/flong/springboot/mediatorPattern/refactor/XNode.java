package com.flong.springboot.mediatorPattern.refactor;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 8:49 PM
 */
@Data
@NoArgsConstructor
public class XNode {

    private String namespace;
    private String id;
    private String parameterType;
    private String resultType;
    private String sql;
    private Map<Integer, String> parameter;
}
