package com.example.buildingstandem.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponseDTO {
    @Builder.Default
    String title = "error";
    String message;
    String details;
}
