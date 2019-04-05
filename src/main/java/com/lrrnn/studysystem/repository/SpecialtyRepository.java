package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SpecialtyRepository extends JpaRepository<Specialty, Long> {

    @Query("select s from Specialty s where s.specialtyName = ?1")
    Specialty findSpecialtyBySpecialtyName(String specialtyName);
}
