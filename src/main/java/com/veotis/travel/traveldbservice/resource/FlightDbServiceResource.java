package com.veotis.travel.traveldbservice.resource;


import com.veotis.travel.traveldbservice.models.Flight;
import com.veotis.travel.traveldbservice.models.Professional;
import com.veotis.travel.traveldbservice.repositories.FlightRepository;
import com.veotis.travel.traveldbservice.repositories.ProfessionalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/db/flight")
public class FlightDbServiceResource {


    private FlightRepository flightRepository;

    public FlightDbServiceResource(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }


    @GetMapping("")
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable("id") final int id){
        return flightRepository.getOne(id);
    }

    @PostMapping("/add")
    public Flight addFlight(@RequestBody final Flight flight){
        return flightRepository.saveAndFlush(flight);
    }



    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable("id") final int id){
        Flight flight =  flightRepository.getOne(id);
        flightRepository.delete(flight);

    }


    @PutMapping("/update")
    public Flight updateFlight(@RequestBody final Flight flight){
        Flight c = flightRepository.getOne(flight.getId());
        c.setDate(flight.getDate());
        c.setCompany(flight.getCompany());
        c.setFlightClass(flight.getFlightClass());
        c.setProfessionals(flight.getProfessionals());
        c.setNumber(flight.getNumber());
        c.setFlightFrom(flight.getFlightFrom());
        c.setFlightTo(flight.getFlightTo());
        flightRepository.saveAndFlush(c);
        return c;
    }


    


}
