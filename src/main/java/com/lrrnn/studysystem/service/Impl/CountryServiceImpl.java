package com.lrrnn.studysystem.service.Impl;

import com.lrrnn.studysystem.bean.Country;
import com.lrrnn.studysystem.repository.CountryRepository;
import com.lrrnn.studysystem.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public int saveCountry(Country country) {

        if (countryRepository.findCountryByCountryName(country.getCountryName()) == null) {
            countryRepository.save(country);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int delCountry(long countryId) {

        countryRepository.deleteById(countryId);
        return 1;
    }

    @Override
    public List<Country> findAllCountry() {
        return countryRepository.findAll();
    }

    @Override
    public Country findCountryByCountryName(String countryName) {
        return countryRepository.findCountryByCountryName(countryName);
    }
}
