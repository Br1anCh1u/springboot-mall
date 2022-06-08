package com.br1anch1u.springbootmall.service.impl;

import com.br1anch1u.springbootmall.dao.UserDao;
import com.br1anch1u.springbootmall.dto.UserLoginRequest;
import com.br1anch1u.springbootmall.dto.UserRegisterRequest;
import com.br1anch1u.springbootmall.model.User;
import com.br1anch1u.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.server.ResponseStatusException;

import java.nio.charset.StandardCharsets;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao dao;

    @Override
    public User getUserById(Integer userId) {
        return dao.getUserById(userId);
    }

    @Override
    public User login(UserLoginRequest userLoginRequest) {
        User user = dao.getUserByEmail(userLoginRequest.getEmail());

        //check user is existed
        if(user==null){
            logger.warn("{} not registered", userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //md5
        String hashedPassowrd = DigestUtils.md5DigestAsHex(userLoginRequest.getPassword().getBytes());

        //check password
        if(user.getPassword().equals(hashedPassowrd)){
            return user;
        } else {
            logger.warn("{} password wrong ", userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {

        //check user id existed
        User user = dao.getUserByEmail(userRegisterRequest.getEmail());

        if(user != null) {
            logger.warn("{} is used.", userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //MD5
        String hashedPassword = DigestUtils.md5DigestAsHex(userRegisterRequest.getPassword().getBytes());
        userRegisterRequest.setPassword(hashedPassword);

        //create user
        return dao.createUser(userRegisterRequest);
    }
}
