package com.lrrnn.studysystem.service.Impl;

import com.lrrnn.studysystem.bean.Application;
import com.lrrnn.studysystem.repository.ApplicationRepository;
import com.lrrnn.studysystem.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public int saveApplication(Application application) {

        if (applicationRepository.existsById(application.getApplicationId())) {
            applicationRepository.save(application);
            return 1;
        } else {
            if (applicationRepository.findApplicationByUserInfoId(application.getUserInfoId()) == null) {
                applicationRepository.save(application);
                return 1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public int delApplication(long applicationId) {

        applicationRepository.deleteById(applicationId);
        return 1;
    }

    @Override
    public int passApplication(long applicationId) {

        applicationRepository.getOne(applicationId).setApplicationStatus(1);
        return 1;
    }

    @Override
    public List<Application> findAllApplication() {
        return applicationRepository.findAll();
    }

    @Override
    public List<Application> findByApplicationStatus(int applicationStatus) {
        return applicationRepository.findApplicationsByApplicationStatus(applicationStatus);
    }

    @Override
    public List<Application> findByCountryId(long countryId) {
        return applicationRepository.findApplicationsByCountryId(countryId);
    }

    @Override
    public List<Application> findByCollegeId(long collegeId) {
        return applicationRepository.findApplicationsByCollegeId(collegeId);
    }

    @Override
    public List<Application> findBySpecialtyId(long specialtyId) {
        return applicationRepository.findApplicationsBySpecialtyId(specialtyId);
    }

    @Override
    public Application findByUserInfoId(long userInfoId) {
        return applicationRepository.findApplicationByUserInfoId(userInfoId);
    }

    @Override
    public Application findByApplicationId(long applicationId) {
        return applicationRepository.getOne(applicationId);
    }
}
