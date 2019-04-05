package com.lrrnn.studysystem.service;

import com.lrrnn.studysystem.bean.Application;

import java.util.List;

public interface ApplicationService {

    int saveApplication(Application application);
    int delApplication(long applicationId);
    int passApplication(long applicationId);
    List<Application> findAllApplication();
    List<Application> findByApplicationStatus(int applicationStatus);
    List<Application> findByCountryId(long countryId);
    List<Application> findByCollegeId(long collegeId);
    List<Application> findBySpecialtyId(long specialtyId);
    Application findByUserInfoId(long userInfoId);
    Application findByApplicationId(long applicationId);
}
