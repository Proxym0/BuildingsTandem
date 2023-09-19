package com.example.buildingstandem.dto.duildingDto;

import com.example.buildingstandem.entity.Building;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class AllBuildingDto {
    private UUID id;
}
