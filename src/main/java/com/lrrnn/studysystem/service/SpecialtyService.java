package com.lrrnn.studysystem.service;

import com.lrrnn.studysystem.bean.Specialty;

import java.util.List;

public interface SpecialtyService {

    int saveSpecialty(Specialty specialty);
    int delSpecialty(long specialtyId);
    List<Specialty> findAllSpecialty();
    List<Specialty> findAllSpecialtyByCollegeId(long collegeId);
    Specialty findSpecialtyBySpecialtyName(String specialtyName);
}
