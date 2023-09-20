package com.example.buildingstandem.dto;

import lombok.*;

import java.util.UUID;

@Data
@Builder
public class CompanyDTO {
    private UUID id;
    private String nameCompany;
    private String addressCompany;
    private String numberPhoneCompany;
    private String emailCompany;
    private String typeCompany;
    private String password;
}
