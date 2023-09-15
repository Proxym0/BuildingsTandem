package com.example.buildingstandem.controller;

import com.example.buildingstandem.dto.TypeOfConstructionDto;
import com.example.buildingstandem.entity.TypeOfConstruction;
import com.example.buildingstandem.mapper.TypeOfConstructionMapper;
import com.example.buildingstandem.service.TypeOfConstructionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RequestMapping("/constr")
@RestController
@RequiredArgsConstructor
public class TypeOfConstructionController {
    @Autowired
    private TypeOfConstructionService typeOfConstructionService;
    @Autowired
    private TypeOfConstructionMapper mapper;

    @PostMapping
    public ResponseEntity<TypeOfConstruction> create(@RequestBody TypeOfConstructionDto typeOfConstructionDto) {
        TypeOfConstruction save = typeOfConstructionService.save(mapper.toEntity(typeOfConstructionDto));
        return ok(save);
    }
}
