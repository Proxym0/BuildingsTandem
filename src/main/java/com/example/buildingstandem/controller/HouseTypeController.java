package com.example.buildingstandem.controller;

import com.example.buildingstandem.dto.HouseTypeDto;
import com.example.buildingstandem.entity.HouseType;
import com.example.buildingstandem.mapper.HouseTypeMapper;
import com.example.buildingstandem.service.HouseTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/type")
@RequiredArgsConstructor
public class HouseTypeController {
    @Autowired
    private HouseTypeService houseTypeService;
    @Autowired
    private HouseTypeMapper mapper;

    @PostMapping
    public ResponseEntity <HouseType> saveType (@RequestBody HouseTypeDto houseTypeDto){
        return ok(houseTypeService.save(mapper.toEntity(houseTypeDto)));
    }
}
