package com.lrrnn.studysystem.service.Impl;

import com.lrrnn.studysystem.bean.User;
import com.lrrnn.studysystem.repository.UserRepository;
import com.lrrnn.studysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public int saveUser(User user) {

        if (userRepository.findUserByUserName(user.getUserName()) == null) {
            userRepository.save(user);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int delUser(String userName) {
        User user = userRepository.findUserByUserName(userName);
        user.setStatus(0);
        userRepository.save(user);
        return 1;
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

    @Override
    public List<User> findAllByRoles(String role) {
        return userRepository.findUsersByRoles(role);
    }
}
