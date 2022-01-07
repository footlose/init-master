package com.flong.springboot.decorator.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description 装饰器模式
 * 装饰器实现的重点是对抽象类继承接口方式的使用，同时设定被继承的接口可以通过构造函数传递其实现类，由此增加扩展性并重写方法里可以实现此部分父类实现的功能。
 * @date 2021/10/22 3:29 下午
 */
public interface HandlerInterceptor {

    /**
     *
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @author wangshuai 
     * @date 2021/10/22 3:48 下午    
     */
    boolean preHandle(String request, String response, Object handler);

}
