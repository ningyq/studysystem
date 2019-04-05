package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    @Query("select u from UserInfo u where u.applyStatus = ?1")
    List<UserInfo> findUserInfoByApplyStatus(int applyStatus);

    @Query("select u from UserInfo u where u.userName = ?1")
    UserInfo findByUserName(String userName);

    @Query("select u from UserInfo u where u.sex = ?1")
    List<UserInfo> findBySex(String sex);
}
