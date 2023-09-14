package com.example.buildingstandem.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class HouseTypeDto {
    private UUID id;
    private String type;
}
