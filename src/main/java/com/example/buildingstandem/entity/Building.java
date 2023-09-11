package com.example.buildingstandem.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
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
    private UUID id;
    private String completionTime;
    @OneToOne
    private Set<HouseType> houseTypes;
}
