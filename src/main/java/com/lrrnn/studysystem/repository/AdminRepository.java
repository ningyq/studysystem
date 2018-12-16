package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
