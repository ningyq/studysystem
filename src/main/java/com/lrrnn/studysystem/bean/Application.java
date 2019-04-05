package com.lrrnn.studysystem.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long applicationId;

    private  String applyName;

    private  String applyPhone;

    private  long countryId;

    private  long collegeId;

    private  long specialtyId;

    private  String applyContent;

    private  int applicationStatus;

    private  long userInfoId;
}
