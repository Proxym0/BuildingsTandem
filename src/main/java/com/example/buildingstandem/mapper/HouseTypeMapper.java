package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.HouseTypeDto;
import com.example.buildingstandem.entity.HouseType;
import org.mapstruct.Mapper;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;

@Mapper(uses = {BuildingMapper.class},
        componentModel = "spring",
        injectionStrategy = CONSTRUCTOR)
public interface HouseTypeMapper {
    HouseType toEntity(HouseTypeDto houseTypeDto);
    HouseTypeDto toDto(HouseType houseType);
}
