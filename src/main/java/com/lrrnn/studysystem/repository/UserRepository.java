package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
