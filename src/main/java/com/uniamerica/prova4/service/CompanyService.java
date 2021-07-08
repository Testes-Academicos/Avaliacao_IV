package com.uniamerica.prova4.service;

import com.uniamerica.prova4.model.Company;
import com.uniamerica.prova4.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepositoryy;


    public List<Company> findAll() {
        return companyRepositoryy.findAll();
    }
    public Company create(Company company) {
        return companyRepositoryy.save(company);
    }
    public Company find(Long id) {
        return companyRepositoryy.findById(id).orElseThrow(
                () -> new IllegalStateException("company does not exist. id: " + id)
        );
    }
    @Transactional
    public Company update(Long id, Company company1) {
        Company company = this.find(id);
        company.setName(company1.getName());
        company.setCnpj(company1.getCnpj());
        return company;
    }
    public String delete(Long id) {
        Company company = this.find(id);
        companyRepositoryy.delete(company);
        return "company: " + company.getName() + " Was Deleted Successfully!";
    }
}
