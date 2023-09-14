package com.example.buildingstandem.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name= "types")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class HouseType {
    @Id
    @GenericGenerator(name = "custom_gen",
            strategy = "com.example.buildingstandem.entity.CustomIdGenerator")
    @GeneratedValue(generator = "custom_gen")
    @Column(name = "id")
    private UUID id;
    @Column(name = "type")
    private String type;

}
