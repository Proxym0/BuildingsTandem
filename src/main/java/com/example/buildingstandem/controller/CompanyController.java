package com.example.buildingstandem.controller;

import com.example.buildingstandem.dto.CompanyDTO;
import com.example.buildingstandem.entity.Company;
import com.example.buildingstandem.mapper.CompanyMapper;
import com.example.buildingstandem.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.example.buildingstandem.mapper.CompanyMapper.INSTANCE;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;


    @PostMapping("/create")
    public ResponseEntity<Company> createCompany(@RequestBody CompanyDTO companyDTO) {
        return ok(companyService.createCompany(CompanyMapper.INSTANCE.dtoToCompany(companyDTO)));
    }


    @GetMapping("/all")
    public ResponseEntity<List<CompanyDTO>> getAll() {
        List<CompanyDTO> companyDTOList = new ArrayList<>();
        companyService.getAllCompany()
                .forEach(company -> companyDTOList.add(INSTANCE.companyToDTO(company)));
        return ok(companyDTOList);
    }


    @GetMapping("/{nameCompany}")
    public ResponseEntity<CompanyDTO> getByName(@PathVariable String nameCompany) {
        Company company = companyService.getCompanyByName(nameCompany);
        if (company != null) {
            CompanyDTO companyDTO = INSTANCE.companyToDTO(company);
            return ResponseEntity.ok(companyDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
