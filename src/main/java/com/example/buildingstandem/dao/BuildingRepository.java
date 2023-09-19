package com.example.buildingstandem.dao;

import com.example.buildingstandem.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface BuildingRepository extends JpaRepository<Building, UUID> {
    Optional<Building> findById(UUID uuid);

    Optional<Building> deleteBuildingById(UUID uuid);
}

