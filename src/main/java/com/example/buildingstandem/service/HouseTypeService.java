package com.example.buildingstandem.service;

import com.example.buildingstandem.dao.HouseTypeRepository;
import com.example.buildingstandem.entity.HouseType;
import com.example.buildingstandem.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class HouseTypeService {
    @Autowired
    private HouseTypeRepository houseTypeRepository;

    public HouseType save(HouseType houseType) {
        return houseTypeRepository.save(houseType);
    }
    public HouseType findById (UUID id ){
        Optional<HouseType> byId = houseTypeRepository.findById(id);
        if(houseTypeRepository.existsById(id)){
            return byId.get();
        }
        throw new NotFoundException("House type not found");
    }
}
