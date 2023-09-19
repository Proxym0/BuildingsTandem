package com.example.buildingstandem.controller.util;

import com.example.buildingstandem.dto.ErrorResponseDTO;
import com.example.buildingstandem.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> notFoundException(NotFoundException e) {
        ErrorResponseDTO errorResponseDTO = ErrorResponseDTO.builder()
                .message(e.getMessage())
                .details(e.toString())
                .build();
        return ResponseEntity.badRequest().body(errorResponseDTO);
    }

}
