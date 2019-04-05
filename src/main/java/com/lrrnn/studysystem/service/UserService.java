package com.lrrnn.studysystem.service;

import com.lrrnn.studysystem.bean.User;

import java.util.List;

public interface UserService {

    int saveUser(User user);
    int delUser(String userName);
    User findByUserName(String userName);
    List<User> findAllByRoles(String roles);
}
