package com.example.buildingstandem.dto.duildingDto;

import com.example.buildingstandem.controller.util.ValidUuid;
import com.example.buildingstandem.entity.HouseType;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Builder
public class BuildingDto {
    private UUID id;
    @NotNull
    @NotEmpty
    @NotBlank
    private String completionTime;
    @NotNull
    private UUID idHouseType;
    @NotNull
    private UUID idTypeOfConstruction;
}
