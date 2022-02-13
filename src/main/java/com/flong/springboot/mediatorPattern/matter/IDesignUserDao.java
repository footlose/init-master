package com.flong.springboot.mediatorPattern.matter;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 9:14 PM
 */
@Mapper
public interface IDesignUserDao {

    /**
     * 通过ID查询用户信息
     *
     * @param id
     * @return
     * @author wangshuai
     * @date 2022/1/17 9:15 PM
     */
    User queryUserInfoById(Long id);

}
