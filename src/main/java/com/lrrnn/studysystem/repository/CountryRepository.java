package com.lrrnn.studysystem.repository;

import com.lrrnn.studysystem.bean.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
