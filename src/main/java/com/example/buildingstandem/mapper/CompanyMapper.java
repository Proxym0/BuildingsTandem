package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.CompanyDTO;
import com.example.buildingstandem.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyMapper {
    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);
    CompanyDTO companyToDTO(Company company);

    Company dtoToCompany(CompanyDTO companyDTO);
}
