package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CollegeRepository extends JpaRepository<College, Long> {

    @Query("select c from College c where c.collegeName = ?1")
    College findCollegeByCollegeName(String collegeName);
}
