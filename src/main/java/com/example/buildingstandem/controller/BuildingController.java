package com.example.buildingstandem.controller;

import com.example.buildingstandem.dto.BuildingDto;
import com.example.buildingstandem.entity.Building;
import com.example.buildingstandem.mapper.BuildingMapper;
import com.example.buildingstandem.service.BuildingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class BuildingController {
    @Autowired
    private BuildingService buildingService;


    @PostMapping("/save")
    public ResponseEntity<Building> saveBuilding(@RequestBody BuildingDto buildingdto) {

        return ok(buildingService.save(BuildingMapper.INSTANCE.toDto(buildingdto))) ;
    }
}