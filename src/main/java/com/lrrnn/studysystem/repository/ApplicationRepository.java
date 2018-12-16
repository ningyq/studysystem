package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
