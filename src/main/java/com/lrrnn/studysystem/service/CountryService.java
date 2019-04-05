package com.lrrnn.studysystem.service;

import com.lrrnn.studysystem.bean.Country;

import java.util.List;

public interface CountryService {

    int saveCountry(Country country);
    int delCountry(long countryId);
    List<Country> findAllCountry();
    Country findCountryByCountryName(String countryName);
}
