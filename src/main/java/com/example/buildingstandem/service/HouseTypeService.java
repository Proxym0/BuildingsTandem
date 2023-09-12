package com.example.buildingstandem.service;

import com.example.buildingstandem.dao.HouseTypeRepository;
import com.example.buildingstandem.entity.HouseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseTypeService {
    @Autowired
    private HouseTypeRepository houseTypeRepository;

    public HouseType save(HouseType houseType) {
        return houseTypeRepository.save(houseType);
    }
}
