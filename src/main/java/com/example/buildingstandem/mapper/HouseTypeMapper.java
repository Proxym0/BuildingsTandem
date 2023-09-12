package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.HouseTypeDto;
import com.example.buildingstandem.entity.HouseType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HouseTypeMapper {
    HouseTypeMapper INSTANCE = Mappers.getMapper(HouseTypeMapper.class);
    HouseType toDto (HouseTypeDto houseTypeDto);
}
