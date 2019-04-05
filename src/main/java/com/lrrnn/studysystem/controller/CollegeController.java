package com.lrrnn.studysystem.controller;

import com.lrrnn.studysystem.bean.College;
import com.lrrnn.studysystem.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    /**
     * 查询
     */
    @GetMapping
    public List<College> findAll() {
        return collegeService.findAllCollege();
    }

    @GetMapping("/name/{collegeName}")
    public College findByName(@PathVariable String collegeName) {
        return collegeService.findCollegeByCollegeName(collegeName);
    }

    @GetMapping("/country/{countryId}")
    public List<College> findByCountry(@PathVariable long countryId) {
        return collegeService.findAllCollegeByCountry(countryId);
    }



    /**
     * 新增或编辑
     */
    @PostMapping("/save")
    public int save(College college) {
        return collegeService.saveCollege(college);
    }

    /**
     * 删除
     */
    @GetMapping("/del/{collegeId}")
    public int delete(@PathVariable long collegeId) {
        return collegeService.delCollege(collegeId);
    }


}
