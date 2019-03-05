package com.xxh.springboot.controller;

import com.xxh.springboot.model.Users;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xxh on 2019/3/5.
 */
@Controller
@EnableAutoConfiguration
public class UsersController extends BaseController {

    //访问路径
    @RequestMapping("/login")
    public  String  login(){

        Users users=usersServiceImpl.login("xuxuhui","123456");
        System.out.println(users.toString());
        if (users != null) {
            // 后台首页可以通过读取session获取登录用户的信息
            session.setAttribute("users", users);
            System.out.println(users.toString());
            return "redirect:/admin/index.jsp";
        } else {
            request.setAttribute("error", "登录失败!");
            return "forward:/login.jsp";
        }


    }
}
