package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.CollegeSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CollegeSpecialtyRepository extends JpaRepository<CollegeSpecialty, Long> {

    @Query("select c from CollegeSpecialty c where c.collegeId = ?1")
    List<CollegeSpecialty> findByCollegeId(long collegeId);

    @Query("select c from CollegeSpecialty c where c.specialtyId = ?1")
    List<CollegeSpecialty> findBySpecialtyId(long specialtyId);

    @Query("select c.specialtyId from CollegeSpecialty c where c.collegeId = ?1")
    List<Long> findSpecialtyIdByCollegeId(long collegeId);
}
