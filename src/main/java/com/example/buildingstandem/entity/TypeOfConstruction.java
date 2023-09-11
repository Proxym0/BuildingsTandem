package com.example.buildingstandem.entity;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name= "typeOfConstructions")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class TypeOfConstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String typeConstruction;
}
