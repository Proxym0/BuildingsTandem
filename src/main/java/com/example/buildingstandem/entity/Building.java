package com.example.buildingstandem.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "buildings")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Building {

    @Id
    @GenericGenerator(name = "custom_gen",
            strategy = "com.example.buildingstandem.entity.CustomIdGenerator")
    @GeneratedValue(generator = "custom_gen")
    @Column(name = "id")
    private UUID id;
    @Column(name = "completionTime")
    private String completionTime;
    @ManyToOne
    @JoinColumn(name = "house_type_id")
    private HouseType houseTypes;
    @ManyToOne
    @JoinColumn(name = "type_of_construction_id")
    private  TypeOfConstruction typeOfConstruction;
}
