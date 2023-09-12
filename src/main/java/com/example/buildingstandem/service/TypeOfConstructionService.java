package com.example.buildingstandem.service;

import com.example.buildingstandem.dao.TypeOfConstructionRepository;
import com.example.buildingstandem.entity.TypeOfConstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeOfConstructionService {
    @Autowired
    private TypeOfConstructionRepository typeOfConstructionRepository;

    public TypeOfConstruction save(TypeOfConstruction typeOfConstruction) {
        return typeOfConstructionRepository.save(typeOfConstruction);
    }
}
