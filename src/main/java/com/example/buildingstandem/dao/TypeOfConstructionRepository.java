package com.example.buildingstandem.dao;

import com.example.buildingstandem.entity.TypeOfConstruction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TypeOfConstructionRepository extends JpaRepository<TypeOfConstruction, UUID> {
}
