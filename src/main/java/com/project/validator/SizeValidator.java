package com.project.validator;

import com.project.annotations.ValidateSize;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static org.apache.commons.lang3.StringUtils.isNotBlank;


public class SizeValidator implements ConstraintValidator<ValidateSize, String> {

    private int min;
    private int max;
    @Override
    public void initialize(ValidateSize constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        return isNotBlank(name) && name.length() >= min && name.length() <= max;
    }
}