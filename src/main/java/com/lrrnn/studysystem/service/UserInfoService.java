package com.lrrnn.studysystem.service;

import com.lrrnn.studysystem.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    int saveUserInfo(UserInfo userInfo);
    int delUserInfo(String userName);
    UserInfo findByUserName(String userName);
    UserInfo findByUserInfoId(long userInfoId);
    List<UserInfo> findByApplyStatus(int applyStatus);
    List<UserInfo> findUserBySex(String sex);
    List<UserInfo> findAllUser();
}
