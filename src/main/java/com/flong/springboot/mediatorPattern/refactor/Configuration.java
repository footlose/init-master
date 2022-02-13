package com.flong.springboot.mediatorPattern.refactor;

import lombok.Data;

import java.sql.Connection;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 8:56 PM
 */
@Data
public class Configuration {
    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XNode> mapperElement;
}
