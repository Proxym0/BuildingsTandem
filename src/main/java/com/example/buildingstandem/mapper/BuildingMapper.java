package com.example.buildingstandem.mapper;

import com.example.buildingstandem.dto.BuildingDto;
import com.example.buildingstandem.entity.HouseType;
import org.mapstruct.Mapper;
import com.example.buildingstandem.entity.Building;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

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





//        return Building.builder()
//                .id(buildingDto.getId())
//                .completionTime(buildingDto.getCompletionTime())
//                .houseTypes(HouseType.builder()
//                        .id(buildingDto.getIdHouseType())
//                        .build())
//                .build();
//    }


//    default PersonDTO convertCustom(BasicUser user) {
//        return PersonDTO
//                .builder()
//                .id(String.valueOf(user.getId()))
//                .firstName(user.getName().substring(0, user.getName().indexOf(" ")))
//                .lastName(user.getName().substring(user.getName().indexOf(" ") + 1))
//                .build();
//    }
//(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
//        uses = {HouseTypeMapper.class},
//        imports = UUID.class )
//(componentModel = "spring",
//        uses = {HouseType.class},
//        injectionStrategy = CONSTRUCTOR)