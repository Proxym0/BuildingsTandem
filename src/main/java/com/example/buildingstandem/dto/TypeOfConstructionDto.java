package com.example.buildingstandem.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TypeOfConstructionDto {
    private String typeConstruction;
    private UUID id;
}
