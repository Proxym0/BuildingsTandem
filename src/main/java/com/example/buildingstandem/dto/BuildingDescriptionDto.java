package com.example.buildingstandem.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BuildingDescriptionDto {
    private UUID id;
    private String completionTime;
    private String type;
    private String typeConstruction;
}
