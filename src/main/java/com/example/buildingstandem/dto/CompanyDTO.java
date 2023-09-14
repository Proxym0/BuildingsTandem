package com.example.buildingstandem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {
    private UUID id;
    private String nameCompany;
    private String addressCompany;
    private String numberPhoneCompany;
    private String emailCompany;
    private String typeCompany;
    private String password;
}
