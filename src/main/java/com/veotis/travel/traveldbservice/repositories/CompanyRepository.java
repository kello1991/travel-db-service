package com.veotis.travel.traveldbservice.repositories;

import com.veotis.travel.traveldbservice.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

    @Query("SELECT c FROM Company c WHERE c.name = ?1")
    Company findByName(String name);
}
