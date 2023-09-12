package com.example.buildingstandem.dao;

import com.example.buildingstandem.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseTypeRepository extends JpaRepository<Type, Long> {
}
