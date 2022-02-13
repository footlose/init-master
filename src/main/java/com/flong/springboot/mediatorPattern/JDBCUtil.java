package com.flong.springboot.mediatorPattern;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 8:34 PM
 */
@Slf4j
public class JDBCUtil {

    public static final String URL = "jdbc:mysql://101.35.100.126:8306/lottery";
    public static final String USER = "root";
    public static final String PASSWORD = "Ws122013!";

    public static void main(String[] args) throws Exception {
        //1. 加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2. 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3. 操作数据库
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT id, name, age FROM sys_user");
        //4. 如果有数据 resultSet.next() 返回true
        while (resultSet.next()) {
            log.info("测试结果 姓名：{} 年龄：{}", resultSet.getString("name"), resultSet.getInt("age"));
        }
    }


}
