package com.lrrnn.studysystem.controller;

import com.lrrnn.studysystem.bean.Application;
import com.lrrnn.studysystem.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    /**
     * 查询
     */
    @GetMapping()
    public List<Application> findAll() {
        return applicationService.findAllApplication();
    }

    @GetMapping("/id/{applicationId}")
    public Application findById(@PathVariable long applicationId) {
        return applicationService.findByApplicationId(applicationId);
    }

    @GetMapping("/user/{userInfoId}")
    public Application findByUserId(@PathVariable long userInfoId) {
        return applicationService.findByUserInfoId(userInfoId);
    }

    @GetMapping("/status/{applicationStatus}")
    public List<Application> findByApplicationStatus(@PathVariable int applicationStatus) {
        return applicationService.findByApplicationStatus(applicationStatus);
    }

    @GetMapping("/country/{countryId}")
    public List<Application> findByCountry(@PathVariable long countryId) {
        return applicationService.findByCountryId(countryId);
    }

    @GetMapping("/college/{collegeId}")
    public List<Application> findByCollege(@PathVariable long collegeId) {
        return applicationService.findByCollegeId(collegeId);
    }

    @GetMapping("/id/{specialtyId}")
    public List<Application> findBySpecialty(@PathVariable long specialtyId) {
        return applicationService.findBySpecialtyId(specialtyId);
    }

    /**
     * 新增或编辑
     */
    @PostMapping("/save")
    public int save(Application application) {
        return applicationService.saveApplication(application);
    }

    /**
     * 删除
     */
    @GetMapping("/del")
    public int delete(long applicationId) {
        return applicationService.delApplication(applicationId);
    }

    /**
     * 通过
     */
    @PostMapping("/pass/{applicationId}")
    public int pass(@PathVariable long applicationId) {
        return applicationService.passApplication(applicationId);
    }
}