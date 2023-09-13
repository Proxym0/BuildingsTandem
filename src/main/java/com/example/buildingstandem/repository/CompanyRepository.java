package com.example.buildingstandem.repository;

import com.example.buildingstandem.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID> {
    Optional<Company> findCompanyByNameCompany(String nameCompany);
}
