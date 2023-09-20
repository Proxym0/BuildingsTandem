package com.example.buildingstandem.controller;

import com.example.buildingstandem.dto.CompanyDTO;
import com.example.buildingstandem.entity.Company;
import com.example.buildingstandem.mapper.CompanyMapper;
import com.example.buildingstandem.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;





@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private CompanyMapper companyMapper;


    @GetMapping("/all")
    public List<CompanyDTO> findAllCompanies() {
        List<Company> companies = companyService.findAllCompanies();
        return companyMapper.companyToCompanyDTOList(companies);
    }

    @PostMapping("/create")
    public CompanyDTO createCompany(@RequestBody CompanyDTO companyDTO) {
        Company company = companyMapper.dtoToCompany(companyDTO);
        company = companyService.createCompany(company);
        return companyMapper.companyToDTO(company);
    }

    @GetMapping("/{id}")
    public CompanyDTO findCompanyById(@PathVariable UUID id) {
        Company company = companyService.getCompanyById(id);
        return companyMapper.companyToDTO(company);
    }

    @GetMapping("/name/{nameCompany}")
    public ResponseEntity<CompanyDTO> findCompanyByName(@PathVariable String nameCompany) {
        Optional<Company> company = companyService.getCompanyByName(nameCompany);
        if (company.isPresent()) {
            CompanyDTO companyDTO = companyMapper.companyToDTO(company.get());
            return ResponseEntity.ok(companyDTO);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}

