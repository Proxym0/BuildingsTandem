package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.BuildingDto;
import com.example.buildingstandem.entity.Building;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;


@Mapper(componentModel = "spring",
        uses = {HouseTypeMapper.class, TypeOfConstructionMapper.class},
        injectionStrategy = CONSTRUCTOR)
public interface BuildingMapper {
    //    @Mapping(source = "houseType.id", target = "idHouseType")
    @Mapping(source = "building.houseTypes.id", target = "idHouseType")
    @Mapping(source = "building.typeOfConstruction.id", target = "idTypeOfConstruction")
    BuildingDto toDto(Building building);
    @Mapping(source = "buildingDto.idHouseType", target = "houseTypes.id")
    @Mapping(source = "buildingDto.idTypeOfConstruction", target = "typeOfConstruction.id")
    Building toEntity (BuildingDto buildingDto);

}
