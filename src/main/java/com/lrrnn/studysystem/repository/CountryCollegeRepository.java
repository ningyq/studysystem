package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.CountryCollege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryCollegeRepository extends JpaRepository<CountryCollege, Long> {

    @Query("select c from CountryCollege c where c.countryId = ?1")
    List<CountryCollege> findByCountryId(long countryId);

    @Query("select c from CountryCollege c where c.collegeId = ?1")
    List<CountryCollege> findByCollegeId(long collegeId);

    @Query("select c.collegeId from CountryCollege c where c.countryId = ?1")
    List<Long> findCollegeIdByCountryId(long countryId);
}
