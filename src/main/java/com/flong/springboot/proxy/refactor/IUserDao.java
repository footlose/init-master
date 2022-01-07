package com.flong.springboot.proxy.refactor;

import com.flong.springboot.proxy.refactor.agent.Select;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/2 5:28 下午
 */
public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
