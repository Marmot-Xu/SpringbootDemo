package com.xxh.springboot.service;

import com.xxh.springboot.mapper.UsersMapper;
import com.xxh.springboot.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xxh on 2019/3/5.
 */
@Service(value = "UsersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;
    @Override
    public Users login(String name, String password) {
        return  usersMapper.login(name,password);
    }
}
