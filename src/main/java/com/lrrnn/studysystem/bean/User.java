package com.lrrnn.studysystem.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private  String userName;

    private  String pwd;

    private  String phone;

    private  String roles;

    private  int status;
}
