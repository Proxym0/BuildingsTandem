package com.example.buildingstandem.service;

import com.example.buildingstandem.dao.BuildingRepository;
import com.example.buildingstandem.entity.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BuildingService {
@Autowired
private BuildingRepository buildingRepository;
    public Building save(Building building){
      return buildingRepository.save(building);
    }

    public Building findById (UUID id){
        Optional<Building> building = buildingRepository.findById(id);
        if(building.isPresent()){
            return building.get();
        }
        throw new RuntimeException();
    }
    public List<Building> findAll (){
        return new ArrayList<>(buildingRepository.findAll());
    }
}

