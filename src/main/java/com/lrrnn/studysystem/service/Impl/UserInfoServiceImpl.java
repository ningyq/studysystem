package com.lrrnn.studysystem.service.Impl;

import com.lrrnn.studysystem.bean.UserInfo;
import com.lrrnn.studysystem.repository.UserInfoRepository;
import com.lrrnn.studysystem.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public int saveUserInfo(UserInfo userInfo) {

        userInfoRepository.save(userInfo);
        return 1;
    }

    @Override
    public int delUserInfo(String userName) {

        userInfoRepository.deleteById(userInfoRepository.findByUserName(userName).getUserInfoId());
        return 1;
    }

    @Override
    public UserInfo findByUserName(String userName) {
        return userInfoRepository.findByUserName(userName);
    }

    @Override
    public UserInfo findByUserInfoId(long userInfoId) {
        return userInfoRepository.getOne(userInfoId);
    }

    @Override
    public List<UserInfo> findByApplyStatus(int applyStatus) {
        return userInfoRepository.findUserInfoByApplyStatus(applyStatus);
    }

    @Override
    public List<UserInfo> findUserBySex(String sex) {
        return userInfoRepository.findBySex(sex);
    }

    @Override
    public List<UserInfo> findAllUser() {
        return userInfoRepository.findAll();
    }
}
