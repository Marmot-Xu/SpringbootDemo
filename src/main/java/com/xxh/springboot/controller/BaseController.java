package com.xxh.springboot.controller;

import com.xxh.springboot.service.UsersService;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by xxh on 2019/3/5.
 */
public class BaseController {
    public BaseController(){
        System.out.println("BaseController().........");
    }

    //    @Resource // 依赖注入,类似XML配置,但是注解可以不用写set方法
//    protected ProductService productService = null;
//
    @Resource // 依赖注入,类似XML配置,但是注解可以不用写set方法
    protected UsersService usersServiceImpl = null;

    // MVC会自动注入request session application内置对象,
    // 此处request,session已经做处理,不需要担心线程安全问题
    @Resource
    protected HttpServletRequest request; // 按类型注入

    @Resource
    protected HttpSession session; // 按类型注入
    @Resource
    protected ServletContext application; // 按类型注入
}
