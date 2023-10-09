package com.example.buildingstandem.service;


import com.example.buildingstandem.dao.BuildingRepository;
import com.example.buildingstandem.entity.Building;
import com.example.buildingstandem.entity.HouseType;
import com.example.buildingstandem.entity.TypeOfConstruction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class BuildingServiceTest {
    @Mock
    private BuildingRepository buildingRepository;
    @InjectMocks
    private BuildingService buildingService;
    @Autowired
    private HouseTypeService houseTypeService;
    @Autowired
    private TypeOfConstructionService typeOfConstructionService;
    private Building building;

    @BeforeEach
    public void init() {
        HouseType byId1 = houseTypeService.findById(UUID.fromString("d06b3a2c-dbb7-4659-93b9-943321390304"));
        TypeOfConstruction byId = typeOfConstructionService.findById(UUID.fromString("ee71e4a9-3217-4824-93bb-dcbf4bf7f6f5"));
        building = Building.builder()
                .id(UUID.fromString("6925ae80-d109-4ef8-a3a7-f0daa7b07fb3"))
                .completionTime("02.2023")
                .houseTypes(byId1)
                .typeOfConstruction(byId)
                .build();
    }

    @Test
    @DisplayName("Test for save method")
    public void BuildingService_Save_ReturnBuilding() {
        when(buildingRepository.save(Mockito.any(Building.class))).thenReturn(building);
        Building save = buildingService.save(building);
        assertNotNull(save);
    }

    @Test
    @DisplayName("Test for remove method")
    void BuildingService_Remove_ReturnNothing() {
        buildingService.deleteBuilding(building.getId());

    }
}
