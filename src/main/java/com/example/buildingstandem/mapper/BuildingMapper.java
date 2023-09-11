package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.BuildingDto;
import org.mapstruct.Mapper;
import com.example.buildingstandem.entity.Building;
import org.mapstruct.factory.Mappers;


@Mapper
public interface BuildingMapper {
    BuildingMapper INSTANCE = Mappers.getMapper(BuildingMapper.class);
    Building toDto(BuildingDto buildingDto);
}
