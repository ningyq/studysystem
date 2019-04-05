package com.lrrnn.studysystem.service;

import com.lrrnn.studysystem.bean.College;

import java.util.List;

public interface CollegeService {

    int saveCollege(College college);
    int delCollege(long collegeId);
    List<College> findAllCollege();
    List<College> findAllCollegeByCountry(long countryId);
    College findCollegeByCollegeName(String collegeName);
}
