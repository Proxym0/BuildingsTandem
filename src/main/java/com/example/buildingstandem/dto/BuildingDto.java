package com.example.buildingstandem.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BuildingDto {
    private UUID id;
    private String completionTime;
}
