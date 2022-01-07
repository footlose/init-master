package com.flong.springboot.decorator.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/22 3:29 下午
 */
public class SsoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        return ticket.equals("success");
    }

}
