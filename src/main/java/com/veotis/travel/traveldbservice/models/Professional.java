package com.veotis.travel.traveldbservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.veotis.travel.traveldbservice.enums.Gender;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Professional{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    @Embedded
    private Address address;
    private String jobTitle;
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Enumerated
    private Gender gender;

    @JsonIgnoreProperties("professionals")
    @ManyToOne(targetEntity = Company.class)
    private Company company;



    @ManyToMany(targetEntity = Flight.class, mappedBy = "professionals")
    private List<Flight> flights;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Professional(String firstName, String lastName, Address address, String jobTitle, Date birthday, Company company, List<Flight> flights) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.jobTitle = jobTitle;
        this.birthday = birthday;
        this.company = company;
        this.flights = flights;
    }

    public Professional() {
    }
}
