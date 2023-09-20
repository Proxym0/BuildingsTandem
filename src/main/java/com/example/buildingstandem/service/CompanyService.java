package com.example.buildingstandem.service;

import com.example.buildingstandem.entity.Building;
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

    public List<Company> findAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(UUID id) {
        Optional<Company> company = companyRepository.findById(id);
        if (company.isPresent()) {
            return company.get();
        }
        throw new RuntimeException();

    }

    public Optional<Company> getCompanyByName(String nameCompany) {
        Optional<Company> company = companyRepository.findCompanyByNameCompany(nameCompany);
        if (company.isPresent()) {
            return Optional.of(company.get());
        }
        throw new RuntimeException();
    }
    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }


}
