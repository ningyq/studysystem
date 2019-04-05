package com.lrrnn.studysystem.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class CountryCollege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long countryCollegeId;

    private long countryId;

    private long collegeId;
}
