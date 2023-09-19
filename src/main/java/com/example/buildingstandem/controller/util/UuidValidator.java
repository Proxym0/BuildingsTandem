package com.example.buildingstandem.controller.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.UUID;

public class UuidValidator implements ConstraintValidator<ValidUuid, UUID> {
    @Override
    public void initialize(ValidUuid constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
    @Override
    public boolean isValid(UUID value, ConstraintValidatorContext context) {
        return false;
    }
}
