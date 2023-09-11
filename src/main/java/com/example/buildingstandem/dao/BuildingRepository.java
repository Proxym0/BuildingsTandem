package com.example.buildingstandem.dao;

import com.example.buildingstandem.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
//        Optional<Building> findById(UUID uuid);
}
