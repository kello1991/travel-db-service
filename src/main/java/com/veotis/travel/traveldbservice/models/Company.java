package com.veotis.travel.traveldbservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.veotis.travel.traveldbservice.enums.Gender;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Company{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String activityArea;

    @Embedded
    private Address address;

    @JsonIgnoreProperties("company")
    @OneToMany(targetEntity = Professional.class, mappedBy = "company")
    private List<Professional> professionals;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivityArea() {
        return activityArea;
    }

    public void setActivityArea(String activityArea) {
        this.activityArea = activityArea;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Professional> getProfessionals() {
        return professionals;
    }

    public void setProfessionals(List<Professional> professionals) {
        this.professionals = professionals;
    }

    public Company() {
    }

    public Company(String name, String activityArea, Address address, List<Professional> professionals) {
        this.name = name;
        this.activityArea = activityArea;
        this.address = address;
        this.professionals = professionals;
    }

    public Company(String name, String activityArea, Address address) {
        this.name = name;
        this.activityArea = activityArea;
        this.address = address;
    }
}
