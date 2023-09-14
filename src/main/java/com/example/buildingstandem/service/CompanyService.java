package com.example.buildingstandem.service;

import com.example.buildingstandem.entity.Company;
import com.example.buildingstandem.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }


    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }



    public Company getCompanyByName(String nameCompany) {
        return companyRepository.findCompanyByNameCompany(nameCompany)
                .orElse(null);
    }


}
