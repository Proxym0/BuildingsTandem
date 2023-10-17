package com.example.buildingstandem.service;

import com.example.buildingstandem.dao.BuildingRepository;
import com.example.buildingstandem.dto.duildingDto.BuildingDto;
import com.example.buildingstandem.entity.Building;
import com.example.buildingstandem.exception.NotFoundException;
import com.example.buildingstandem.mapper.BuildingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;
    @Autowired
    private BuildingMapper mapper;

    public Building save(Building building) {
        return buildingRepository.save(building);
    }

    public Building findById(UUID id) {
        Optional<Building> building = buildingRepository.findById(id);
        if (building.isPresent()) {
            return building.get();
        }
            throw new NotFoundException("Building not found");
    }

    public List<Building> findAll() {
        return new ArrayList<>(buildingRepository.findAll());
    }

    public Building updateBuilding(BuildingDto buildingDto) {
        Optional<Building> building = buildingRepository.findById(buildingDto.getId());
        Building building1 = building.get();
        mapper.updateModel(buildingDto, building1);
        Building save = buildingRepository.save(building1);
        return save;
    }

    public void deleteBuilding(UUID id) {
        buildingRepository.deleteBuildingById(id);
    }

}

