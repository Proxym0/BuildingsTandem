package com.example.buildingstandem.controller.util;

import com.example.buildingstandem.dto.ErrorExtension;
import com.example.buildingstandem.dto.ErrorResponseDTO;
import com.example.buildingstandem.exception.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

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

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List<ErrorExtension>> handleConstraintViolation(ConstraintViolationException exception) {
        List<ErrorExtension> extensions = exception.getConstraintViolations()
                .stream()
                .map(violation -> new ErrorExtension(violation.getMessage(), "invalid_param"))
                .collect(Collectors.toList());
        return new ResponseEntity<>(extensions, HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> messages = ex.getBindingResult().getFieldErrors().stream()
                .map(error -> error.getField() + " " + error.getDefaultMessage())
                .collect(Collectors.toList());
        return new ResponseEntity<>(messages, HttpStatus.BAD_REQUEST);
    }


}
