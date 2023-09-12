package com.example.buildingstandem.dao;

import com.example.buildingstandem.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BuildingRepository extends JpaRepository<Building, Long> {
        Optional<Building> findById(UUID uuid);
}
