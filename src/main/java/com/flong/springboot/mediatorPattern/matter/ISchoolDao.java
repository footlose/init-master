package com.flong.springboot.mediatorPattern.matter;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 9:15 PM
 */
@Mapper
public interface ISchoolDao {

    /**
     * 通过ID 查询学校信息
     *
     * @param treeId
     * @return
     * @author wangshuai
     * @date 2022/1/17 9:16 PM
     */
    School querySchoolInfoById(Long treeId);

}
