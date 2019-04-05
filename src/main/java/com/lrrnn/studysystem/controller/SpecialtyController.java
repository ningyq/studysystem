package com.lrrnn.studysystem.controller;

import com.lrrnn.studysystem.bean.Specialty;
import com.lrrnn.studysystem.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specialty")
public class SpecialtyController {

    @Autowired
    private SpecialtyService specialtyService;

    /**
     * 查询
     */
    @GetMapping
    public List<Specialty> findAll() {
        return specialtyService.findAllSpecialty();
    }

    @GetMapping("/name/{specialtyName}")
    public Specialty findByName(@PathVariable String specialtyName) {
        return specialtyService.findSpecialtyBySpecialtyName(specialtyName);
    }

    @GetMapping("/college/{collegeId}")
    public List<Specialty> findByCountry(@PathVariable long collegeId) {
        return specialtyService.findAllSpecialtyByCollegeId(collegeId);
    }



    /**
     * 新增或编辑
     */
    @PostMapping("/save")
    public int save(Specialty specialty) {
        return specialtyService.saveSpecialty(specialty);
    }

    /**
     * 删除
     */
    @GetMapping("/del/{specialtyId}")
    public int delete(@PathVariable long specialtyId) {
        return specialtyService.delSpecialty(specialtyId);
    }
}
