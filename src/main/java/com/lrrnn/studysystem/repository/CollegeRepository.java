package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
