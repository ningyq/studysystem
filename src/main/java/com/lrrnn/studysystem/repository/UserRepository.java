package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    @Query("select u from User u where u.userName = ?1")
    User findUserByUserName(String userName);

    @Query("select u from User u where u.roles = ?1")
    List<User> findUsersByRoles(String roles);
}
