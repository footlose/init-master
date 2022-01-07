package com.flong.springboot.facade.protogenesis;

import com.flong.springboot.facade.matter.UserInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/28 8:24 上午
 */
@Service
public class HelloWorldService {

    public UserInfo queryUserInfo(@RequestParam String userId) {
        // 做白名单拦截
        List<String> userList = new ArrayList<>();
        userList.add("1001");
        userList.add("aaaa");
        userList.add("ccc");
        if (!userList.contains(userId)) {
            return new UserInfo("1111", "非白名单可访问用户拦截！");
        }
        return new UserInfo("虫虫:" + userId, 19, "天津市南开区旮旯胡同100号");
    }


}
