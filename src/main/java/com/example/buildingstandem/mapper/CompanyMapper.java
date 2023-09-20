package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.CompanyDTO;
import com.example.buildingstandem.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    CompanyDTO companyToDTO(Company company);

    Company dtoToCompany(CompanyDTO companyDTO);
    List<CompanyDTO> companyToCompanyDTOList(List<Company> companies);
}
