package com.br1anch1u.springbootmall.dao;

import com.br1anch1u.springbootmall.dto.UserRegisterRequest;
import com.br1anch1u.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
