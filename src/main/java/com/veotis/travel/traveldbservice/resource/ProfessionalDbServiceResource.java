package com.veotis.travel.traveldbservice.resource;


import com.veotis.travel.traveldbservice.models.Professional;
import com.veotis.travel.traveldbservice.repositories.ProfessionalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/db/professional")
public class ProfessionalDbServiceResource {


    private ProfessionalRepository professionalRepository;

    public ProfessionalDbServiceResource(ProfessionalRepository professionalRepository) {
        this.professionalRepository = professionalRepository;
    }


    @GetMapping("")
    public List<Professional> getAllProfessional(){
        return professionalRepository.findAll();
    }

    @GetMapping("/{id}")
    public Professional getProfessionalById(@PathVariable("id") final int id){
        return professionalRepository.getOne(id);
    }

    @PostMapping("/add")
    public Professional addProfessional(@RequestBody final Professional professional){
        return professionalRepository.saveAndFlush(professional);
    }



    @DeleteMapping("/delete/{id}")
    public void deleteProfessional(@PathVariable("id") final int id){
        Professional professional =  professionalRepository.getOne(id);
        professionalRepository.delete(professional);

    }

    @PutMapping("/update")
    public Professional updateCompany(@RequestBody final Professional professional){
        Professional c = professionalRepository.getOne(professional.getId());
        c.setAddress(professional.getAddress());
        c.setFirstName(professional.getFirstName());
        c.setLastName(professional.getLastName());
        c.setJobTitle(professional.getJobTitle());
        c.setBirthday(professional.getBirthday());
        c.setCompany(professional.getCompany());
        c.setFlights(professional.getFlights());
        professionalRepository.saveAndFlush(c);
        return c;
    }

    


}
