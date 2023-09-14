package com.example.buildingstandem.controller;

import com.example.buildingstandem.dto.BuildingDto;
import com.example.buildingstandem.entity.Building;
import com.example.buildingstandem.mapper.BuildingMapper;
import com.example.buildingstandem.service.BuildingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class BuildingController {
    @Autowired
    private BuildingService buildingService;
    @Autowired
    private BuildingMapper mapper;


    @PostMapping("/save")
    public ResponseEntity<Building> saveBuilding(@RequestBody BuildingDto buildingdto) {

        return ok(buildingService.save(mapper.toEntity(buildingdto)));
    }

    @GetMapping("/id")
    @ResponseBody
    public ResponseEntity<BuildingDto> findById(@RequestParam UUID id) {

        Building byId = buildingService.findById(id);
        BuildingDto buildingDto = mapper.toDto(byId);

        return ok(buildingDto);
    }

}
