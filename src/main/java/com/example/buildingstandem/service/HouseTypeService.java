package com.example.buildingstandem.service;

import com.example.buildingstandem.dao.HouseTypeRepository;
import com.example.buildingstandem.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseTypeService {
    @Autowired
    private HouseTypeRepository houseTypeRepository;

    public Type save(Type houseType) {
        return houseTypeRepository.save(houseType);
    }
}
