package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.duildingDto.AllBuildingDto;
import com.example.buildingstandem.dto.duildingDto.BuildingDescriptionDto;
import com.example.buildingstandem.dto.duildingDto.BuildingDto;
import org.mapstruct.*;
import com.example.buildingstandem.entity.Building;

import java.util.List;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;


@Mapper(componentModel = "spring",
        uses = {HouseTypeMapper.class, TypeOfConstructionMapper.class},
        injectionStrategy = CONSTRUCTOR)
public interface BuildingMapper {
    @Mapping(source = "building.houseTypes.id", target = "idHouseType")
    @Mapping(source = "building.typeOfConstruction.id", target = "idTypeOfConstruction")
    BuildingDto toDto(Building building);

    @Mapping(source = "buildingDto.idHouseType", target = "houseTypes.id")
    @Mapping(source = "buildingDto.idTypeOfConstruction", target = "typeOfConstruction.id")
    Building toEntity(BuildingDto buildingDto);

    @Mapping(source = "building.houseTypes.type", target = "type")
    @Mapping(source = "building.completionTime", target = "completionTime")
    @Mapping(source = "building.typeOfConstruction.typeConstruction", target = "typeConstruction")
    BuildingDescriptionDto toDescriptionDto(Building building);

    List<AllBuildingDto> toAllBuildingDto(List<Building> building);

    Building updateModel(BuildingDto buildingDto, @MappingTarget Building building);

}


