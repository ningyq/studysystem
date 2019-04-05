package com.lrrnn.studysystem.service.Impl;

import com.lrrnn.studysystem.bean.Specialty;
import com.lrrnn.studysystem.repository.CollegeSpecialtyRepository;
import com.lrrnn.studysystem.repository.SpecialtyRepository;
import com.lrrnn.studysystem.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Autowired
    private CollegeSpecialtyRepository collegeSpecialtyRepository;

    @Override
    public int saveSpecialty(Specialty specialty) {

        if (specialtyRepository.findSpecialtyBySpecialtyName(specialty.getSpecialtyName()) == null) {
            specialtyRepository.save(specialty);
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public int delSpecialty(long specialtyId) {

        specialtyRepository.deleteById(specialtyId);
        collegeSpecialtyRepository.deleteAll(collegeSpecialtyRepository.findBySpecialtyId(specialtyId));
        return 1;
    }

    @Override
    public List<Specialty> findAllSpecialty() {
        return specialtyRepository.findAll();
    }

    @Override
    public List<Specialty> findAllSpecialtyByCollegeId(long collegeId) {
        return specialtyRepository.findAllById(collegeSpecialtyRepository.findSpecialtyIdByCollegeId(collegeId));
    }

    @Override
    public Specialty findSpecialtyBySpecialtyName(String specialtyName) {
        return specialtyRepository.findSpecialtyBySpecialtyName(specialtyName);
    }
}
