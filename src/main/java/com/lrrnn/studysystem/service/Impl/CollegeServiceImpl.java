package com.lrrnn.studysystem.service.Impl;

import com.lrrnn.studysystem.bean.College;
import com.lrrnn.studysystem.repository.CollegeRepository;
import com.lrrnn.studysystem.repository.CollegeSpecialtyRepository;
import com.lrrnn.studysystem.repository.CountryCollegeRepository;
import com.lrrnn.studysystem.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    @Autowired
    private CollegeSpecialtyRepository collegeSpecialtyRepository;

    @Autowired
    private CountryCollegeRepository countryCollegeRepository;

    @Override
    public int saveCollege(College college) {
        if (collegeRepository.findCollegeByCollegeName(college.getCollegeName()) == null) {
            collegeRepository.save(college);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int delCollege(long collegeId) {

        collegeRepository.deleteById(collegeId);
        countryCollegeRepository.deleteAll(countryCollegeRepository.findByCollegeId(collegeId));
        collegeSpecialtyRepository.deleteAll(collegeSpecialtyRepository.findByCollegeId(collegeId));
        return 1;
    }

    @Override
    public List<College> findAllCollege() {
        return collegeRepository.findAll();
    }

    @Override
    public List<College> findAllCollegeByCountry(long countryId) {

        return collegeRepository.findAllById(countryCollegeRepository.findCollegeIdByCountryId(countryId));
    }

    @Override
    public College findCollegeByCollegeName(String collegeName) {
        return collegeRepository.findCollegeByCollegeName(collegeName);
    }
}
