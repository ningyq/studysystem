package com.lrrnn.studysystem.controller;

import com.lrrnn.studysystem.bean.Country;
import com.lrrnn.studysystem.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    /**
     * 查询
     */
    @GetMapping
    public List<Country> findAll() {
        return countryService.findAllCountry();
    }

    @GetMapping("/name/{countryName}")
    public Country findByName(@PathVariable String countryName) {
        return countryService.findCountryByCountryName(countryName);
    }

    /**
     * 新增或编辑
     */
    @PostMapping("/save")
    public int save(Country country) {
        return countryService.saveCountry(country);
    }

    /**
     * 删除
     */
    @GetMapping("/del/{countryId}")
    public int delete(@PathVariable long countryId) {
        return countryService.delCountry(countryId);
    }
}
