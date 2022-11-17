package com.baseproject.auth.dto;

import com.baseproject.auth.validator.ValidStrenghtPassword;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RecoverDto {

	private String uuid;

	@NotBlank
	@ValidStrenghtPassword
	private String password;

	@NotBlank
	private String passwordConfirm;
	
}
