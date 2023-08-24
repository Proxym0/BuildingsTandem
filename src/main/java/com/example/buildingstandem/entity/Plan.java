package com.example.buildingstandem.entity;

import lombok.Data;

import java.util.UUID;

public class Plan {
    private UUID id;
//    private String name;
    private String square;
    private String type;  // жилое или не жилое помещение (прописать фронту выпадаещее окно с выбором)
    private String squareKitchen;
    private int room; // прописать "студия" в цифровом виде, к примеру -1
    // (прописать фронту выпадаещее окно с выбором:студия, 1,2,3 ...)
    private String squareLiving;
    private String apartmentDecor;  // чероновая, чистовая, без отделки (прописать фронту выпадаещее окно с выбором)
    private int balcony;
    private int bathroom;
    private Data URL; // загрузка схемы планировки
    private String view; // Enum?


}
