package com.flong.springboot.mediatorPattern.refactor;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 8:57 PM
 */
@org.springframework.context.annotation.Configuration
public class SqlSessionFactoryBuilder implements EnvironmentAware {

    private Environment environment;

    Pattern pattern = Pattern.compile("(#\\{(.*?)})");

    /**
     * 1.构建实例化元素
     *
     * @return
     * @author wangshuai
     * @date 2022/1/17 9:08 PM
     */
    public DefaultSqlSessionFactory build() throws DocumentException {
        Configuration configuration = parseConfiguration();
        return new DefaultSqlSessionFactory(configuration);
    }

    /**
     * 2.解析配置
     *
     * @return
     * @author wangshuai
     * @date 2022/1/17 9:09 PM
     */
    private Configuration parseConfiguration() throws DocumentException {
        Configuration configuration = new Configuration();
        String driver = environment.getProperty("design.jdbc.datasource.driver");
        String url = environment.getProperty("design.jdbc.datasource.url");
        String username = environment.getProperty("design.jdbc.datasource.username");
        String password = environment.getProperty("design.jdbc.datasource.password");

        Map<String, String> dataSource = dataSource(driver, url, username, password);
        configuration.setDataSource(dataSource);
        Connection connection = connection(dataSource);
        configuration.setConnection(connection);
        List<String> files = new ArrayList<>();
        files.add("src/main/resources/mapper/SchoolMapper.xml");
        files.add("src/main/resources/mapper/DesignUserMapper.xml");
        Map<String, XNode> mapperElement = mapperElement(files);
        configuration.setMapperElement(mapperElement);
        return configuration;
    }

    /**
     * 3.获取数据源配置信息
     *
     * @return
     * @author wangshuai
     * @date 2022/1/17 9:09 PM
     */
    private Map<String, String> dataSource(String driver, String url, String username, String password) {
        Map<String, String> dataSource = new HashMap<>(4);
        dataSource.put("driver", driver);
        dataSource.put("url", url);
        dataSource.put("username", username);
        dataSource.put("password", password);
        return dataSource;
    }

    /**
     * 4.获取数据库连接
     *
     * @param dataSource
     * @return
     * @author wangshuai
     * @date 2022/1/17 9:09 PM
     */
    private Connection connection(Map<String, String> dataSource) {
        try {
            String driver = dataSource.get("driver");
            String url = dataSource.get("url");
            String username = dataSource.get("username");
            String password = dataSource.get("password");
            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 5.解析各个mapper中的sql语句
     *
     * @return
     * @author wangshuai
     * @date 2022/1/17 9:09 PM
     */
    private Map<String, XNode> mapperElement(List<String> files) throws DocumentException {
        Map<String, XNode> map = new HashMap<>();
        for (String fileAddress : files) {
            SAXReader reader = new SAXReader();
            Document doc = reader.read(new File(fileAddress));
            Element element = doc.getRootElement();
            //命名空间
            String namespace = element.attributeValue("namespace");
            // SELECT
            List<Element> selectNodes = element.selectNodes("select");
            for (Element node : selectNodes) {
                String id = node.attributeValue("id");
                String parameterType = node.attributeValue("parameterType");
                String resultType = node.attributeValue("resultType");
                String sql = node.getText();
                // ? 匹配
                Map<Integer, String> parameter = new HashMap<>();
                Matcher matcher = pattern.matcher(sql);
                for (int i = 1; matcher.find(); i++) {
                    String g1 = matcher.group(1);
                    String g2 = matcher.group(2);
                    parameter.put(i, g2);
                    sql = sql.replace(g1, "?");
                }
                XNode xNode = new XNode();
                xNode.setNamespace(namespace);
                xNode.setId(id);
                xNode.setParameterType(parameterType);
                xNode.setResultType(resultType);
                xNode.setSql(sql);
                xNode.setParameter(parameter);
                map.put(namespace + "." + id, xNode);
            }
        }
        return map;
    }


    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
