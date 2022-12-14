package com.baseproject.auth.dto;

import com.baseproject.auth.validator.Register;
import com.baseproject.auth.validator.ValidStrenghtPassword;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Register
public class RegisterDto {

	@NotBlank
	private String nome;

	@NotBlank
	private String tel;

	@Email
	@NotBlank
	private String email;

	@NotBlank
	@ValidStrenghtPassword
	private String password;

	@NotBlank
	private String passwordConfirm;

	private String uuid;

}
