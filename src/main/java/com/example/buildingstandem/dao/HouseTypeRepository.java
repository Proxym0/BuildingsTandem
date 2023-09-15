package com.example.buildingstandem.dao;

import com.example.buildingstandem.entity.HouseType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HouseTypeRepository extends JpaRepository<HouseType, UUID> {
}
