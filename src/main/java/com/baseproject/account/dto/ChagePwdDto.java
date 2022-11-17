package com.baseproject.account.dto;

import com.baseproject.auth.validator.ChangePwd;
import com.baseproject.auth.validator.ConfirmPassword;
import com.baseproject.auth.validator.ValidStrenghtPassword;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ChangePwd
public class ChagePwdDto {

	private String uuid;

	@ConfirmPassword
	@NotBlank
	private String oldPassword;
	
	@NotBlank
	@ValidStrenghtPassword
	private String newPassword;

	@NotBlank
	private String newPasswordConfirm;

}
