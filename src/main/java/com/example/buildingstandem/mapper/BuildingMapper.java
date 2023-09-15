package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.AllBuildingDto;
import com.example.buildingstandem.dto.BuildingDescriptionDto;
import com.example.buildingstandem.dto.BuildingDto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import com.example.buildingstandem.entity.Building;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

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
    List<AllBuildingDto> toAllBuildingDto (List<Building> building);
//    @InheritConfiguration
    @Mapping(source = "buildingDto.id", target = "id")
    @Mapping(source = "buildingDto.completionTime", target = "completionTime")
    @Mapping(source = "buildingDto.idHouseType", target = "houseTypes.id")
    @Mapping(source = "buildingDto.idTypeOfConstruction", target = "typeOfConstruction.id")
    void  updateModel(BuildingDto buildingDto, @MappingTarget Building Building);

}


