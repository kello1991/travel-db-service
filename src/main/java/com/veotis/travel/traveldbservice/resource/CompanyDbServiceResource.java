package com.veotis.travel.traveldbservice.resource;


import com.veotis.travel.traveldbservice.models.Company;
import com.veotis.travel.traveldbservice.repositories.CompanyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/db/company")
public class CompanyDbServiceResource {


    private CompanyRepository companyRepository;

    public CompanyDbServiceResource(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @GetMapping("")
    public List<Company> getAllComapny(){

        System.out.println(companyRepository.findAll());
        return companyRepository.findAll();
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable("id") final int id){
        return companyRepository.getOne(id);
    }

    @PostMapping("/add")
    public Company addCompany(@RequestBody final Company company){
        return companyRepository.saveAndFlush(company);
    }

    @GetMapping("/{name}")
    public Company getCompanyByName(@PathVariable("name") final String name){
        return companyRepository.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable("") final int id){
        Company company = companyRepository.getOne(id);
        companyRepository.delete(company);
    }

    @PutMapping("/update")
    public Company updateCompany(@RequestBody final Company company){
        Company c = companyRepository.getOne(company.getId());
        c.setAddress(company.getAddress());
        c.setActivityArea(company.getActivityArea());
        c.setName(company.getName());
        c.setProfessionals(company.getProfessionals());
        companyRepository.saveAndFlush(c);
        return c;
    }




}
