package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CountryRepository extends JpaRepository<Country, Long> {

    @Query("select c from Country c where c.countryName = ?1")
    Country findCountryByCountryName(String countryName);
}
