package com.example.buildingstandem.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Builder
public class HouseTypeDto {
    private UUID id;
    @NotNull
    @NotEmpty
    @NotBlank
    private String type;
}
