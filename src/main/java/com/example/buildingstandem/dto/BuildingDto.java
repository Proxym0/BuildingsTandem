package com.example.buildingstandem.dto;

import com.example.buildingstandem.entity.HouseType;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BuildingDto {
    private UUID id;
    private String completionTime;
    private UUID idHouseType;
    private UUID idTypeOfConstruction;
//    private HouseType houseTypes;
}
