package com.veotis.travel.traveldbservice.models;

import com.veotis.travel.traveldbservice.utils.enums.FlightClass;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String company;
    private String Number;
    private String flightFrom;
    private String flightTo;


    @Enumerated
    private FlightClass flightClass;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToMany(targetEntity = Professional.class)
    private List<Professional> professionals;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public FlightClass getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(FlightClass flightClass) {
        this.flightClass = flightClass;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Professional> getProfessionals() {
        return professionals;
    }

    public void setProfessionals(List<Professional> professionals) {
        this.professionals = professionals;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    public Flight() {
    }

    public Flight(String company, String number, String flightFrom, String flightTo, FlightClass flightClass, Date date) {
        this.company = company;
        Number = number;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightClass = flightClass;
        this.date = date;
    }

    public Flight(String company, String number, String flightFrom, String flightTo, FlightClass flightClass, Date date, List<Professional> professionals) {
        this.company = company;
        Number = number;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightClass = flightClass;
        this.date = date;
        this.professionals = professionals;
    }
}
