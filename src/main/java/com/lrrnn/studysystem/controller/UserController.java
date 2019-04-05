package com.lrrnn.studysystem.controller;

import com.lrrnn.studysystem.bean.User;
import com.lrrnn.studysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询
     */
//    @GetMapping
//    public List<User> findAll() {
//        userService.findAllByRoles()
//    }
    @GetMapping("/name/{userName}")
    public User findByUserName(@PathVariable String userName) {
        return userService.findByUserName(userName);
    }

    /**
     * 新增或编辑
     */
    @PostMapping("/save")
    public int save(User user) {
        return userService.saveUser(user);
    }

    /**
     * 删除
     */
    @GetMapping("/del/{userName}")
    public int delete(@PathVariable String userName) {
        return userService.delUser(userName);
    }

}
