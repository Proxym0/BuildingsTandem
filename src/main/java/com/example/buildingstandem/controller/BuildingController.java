package com.example.buildingstandem.controller;

import com.example.buildingstandem.controller.util.ValidUuid;
import com.example.buildingstandem.dto.duildingDto.AllBuildingDto;
import com.example.buildingstandem.dto.duildingDto.BuildingDescriptionDto;
import com.example.buildingstandem.dto.duildingDto.BuildingDto;
import com.example.buildingstandem.entity.Building;
import com.example.buildingstandem.mapper.BuildingMapper;
import com.example.buildingstandem.service.BuildingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
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
    public ResponseEntity<Building> saveBuilding(@RequestBody @Valid @ValidUuid BuildingDto buildingdto) {

        return ok(buildingService.save(mapper.toEntity(buildingdto)));
    }

    @GetMapping("/id")
    @ResponseBody
    public ResponseEntity<BuildingDescriptionDto> findById(@RequestParam UUID id) {
        Building byId = buildingService.findById(id);
        BuildingDescriptionDto buildingDescriptionDto = mapper.toDescriptionDto(byId);
        return ok(buildingDescriptionDto);
    }

    @GetMapping("/findAll")
    public List<AllBuildingDto> findAllBuildingDto() {
        List<Building> all = buildingService.findAll();
        return mapper.toAllBuildingDto(all);
    }

    @PostMapping("/update")
    @ResponseBody
    public Building updateBuilding(@RequestBody BuildingDto buildingDto) {
        buildingService.updateBuilding(buildingDto);
        return ok(buildingService.updateBuilding(buildingDto)).getBody();
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deleteBuilding(@RequestParam UUID id) {
        buildingService.deleteBuilding(id);
    }
}
