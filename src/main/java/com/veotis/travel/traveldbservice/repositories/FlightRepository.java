package com.veotis.travel.traveldbservice.repositories;

import com.veotis.travel.traveldbservice.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Integer> {

}
