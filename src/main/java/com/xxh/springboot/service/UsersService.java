package com.xxh.springboot.service;

import com.xxh.springboot.model.Users;

/**
 * Created by xxh on 2019/3/5.
 */
public interface UsersService {

    public abstract Users login(String name, String password);
}
