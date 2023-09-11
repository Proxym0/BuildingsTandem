package com.example.buildingstandem.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;
@Entity
@Table(name= "houseTypes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class HouseType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String typeHouse;
    @OneToOne(mappedBy = "house_types")
    private Set<Building> buildings;
}
