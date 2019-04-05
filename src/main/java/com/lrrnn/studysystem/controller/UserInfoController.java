package com.lrrnn.studysystem.controller;

import com.lrrnn.studysystem.bean.UserInfo;
import com.lrrnn.studysystem.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 查询
     */
    @GetMapping("/id/{userInfoId}")
    public UserInfo findById(@PathVariable long userInfoId) {
        return userInfoService.findByUserInfoId(userInfoId);
    }

    @GetMapping("/name/{userName}")
    public UserInfo findByUserName(@PathVariable String userName) {
        return userInfoService.findByUserName(userName);
    }

    @GetMapping("/status/{applyStatus}")
    public List<UserInfo> findByApplyStatus(@PathVariable int applyStatus) {
        return userInfoService.findByApplyStatus(applyStatus);
    }

    @GetMapping("/sex/{sex}")
    public List<UserInfo> findBySex(@PathVariable String sex) {
        return userInfoService.findUserBySex(sex);
    }

    /**
     * 新增或编辑
     */
    @PostMapping("/save")
    public int save(UserInfo userInfo) {
        return userInfoService.saveUserInfo(userInfo);
    }

    /**
     * 删除
     */
    @GetMapping("/del/{userName}")
    public int delete(@PathVariable String userName) {
        return userInfoService.delUserInfo(userName);
    }

}
