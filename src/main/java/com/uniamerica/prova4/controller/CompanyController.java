package com.uniamerica.prova4.controller;

import com.uniamerica.prova4.model.Company;
import com.uniamerica.prova4.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/companys")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> findAll() {
        return companyService.findAll();
    }
    @PostMapping
    public Company create(@Valid @RequestBody Company company){
        return companyService.create(company);
    }
    @PutMapping("/{id}")
    public Company update(@PathVariable("id") Long id, @Valid @RequestBody Company company){
        return companyService.update(id, company);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        return companyService.delete(id);
    }
    @GetMapping("/{id}")
    public Company find(@PathVariable("id") Long id) {
        return companyService.find(id);
    }
}
