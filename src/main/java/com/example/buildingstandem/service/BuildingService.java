package com.example.buildingstandem.service;

import com.example.buildingstandem.dao.BuildingRepository;
import com.example.buildingstandem.entity.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {
@Autowired
private BuildingRepository buildingRepository;
    public Building save(Building building){
      return buildingRepository.save(building);
    }
}
