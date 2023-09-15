package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.TypeOfConstructionDto;
import com.example.buildingstandem.entity.TypeOfConstruction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeOfConstructionMapper {
    TypeOfConstruction toEntity(TypeOfConstructionDto typeOfConstructionDto);
    TypeOfConstructionDto toDto(TypeOfConstruction typeOfConstruction);

}
