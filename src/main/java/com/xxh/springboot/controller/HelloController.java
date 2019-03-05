package com.xxh.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xxh on 2019/3/5.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hellocontroller(){

        return  "hello";
    }
}
