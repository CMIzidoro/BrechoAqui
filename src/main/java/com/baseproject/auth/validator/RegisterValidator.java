package com.baseproject.auth.validator;

import com.baseproject.auth.dto.RegisterDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RegisterValidator implements ConstraintValidator<Register, RegisterDto> {

	@Override
	public void initialize(Register p) {
	}

	public boolean isValid(RegisterDto dto, ConstraintValidatorContext c) {
		return dto.getPassword().equals(dto.getPasswordConfirm());
	}

}