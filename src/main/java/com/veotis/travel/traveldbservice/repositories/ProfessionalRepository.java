package com.veotis.travel.traveldbservice.repositories;

import com.veotis.travel.traveldbservice.models.Professional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProfessionalRepository extends JpaRepository<Professional,Integer> {

}
