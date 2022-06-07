package com.br1anch1u.springbootmall.service.impl;

import com.br1anch1u.springbootmall.dao.UserDao;
import com.br1anch1u.springbootmall.dto.UserRegisterRequest;
import com.br1anch1u.springbootmall.model.User;
import com.br1anch1u.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return dao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return dao.getUserById(userId);
    }
}
