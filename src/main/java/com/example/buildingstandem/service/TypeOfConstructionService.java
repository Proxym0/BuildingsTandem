package com.example.buildingstandem.service;

import com.example.buildingstandem.dao.TypeOfConstructionRepository;
import com.example.buildingstandem.entity.TypeOfConstruction;
import com.example.buildingstandem.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class TypeOfConstructionService {
    @Autowired
    private TypeOfConstructionRepository typeOfConstructionRepository;

    public TypeOfConstruction save(TypeOfConstruction typeOfConstruction) {
        return typeOfConstructionRepository.save(typeOfConstruction);
    }
    public TypeOfConstruction findById (UUID id ){
        Optional<TypeOfConstruction> byId = typeOfConstructionRepository.findById(id);
        if(typeOfConstructionRepository.existsById(id)){
            return byId.get();
        }
        throw new NotFoundException("House type not found");
    }
}
