package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    @Query("select a from Application a where a.countryId = ?1")
    List<Application> findApplicationsByCountryId(long countryId);

    @Query("select a from Application a where a.collegeId = ?1")
    List<Application> findApplicationsByCollegeId(long collegeId);

    @Query("select a from Application a where a.specialtyId = ?1")
    List<Application> findApplicationsBySpecialtyId(long specialtyId);

    @Query("select a from Application a where a.applicationStatus = ?1")
    List<Application> findApplicationsByApplicationStatus(int applicationStatus);

    @Query("select a from Application a where a.userInfoId = ?1")
    Application findApplicationByUserInfoId(long userInfoId);
}
