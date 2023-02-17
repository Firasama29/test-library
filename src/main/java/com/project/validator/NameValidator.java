package com.project.validator;

import com.project.annotations.ValidateName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class NameValidator implements ConstraintValidator<ValidateName, String> {

    private String name;
    @Override
    public void initialize(ValidateName constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        return isNotBlank(name);
    }
}