package com.baseproject.shared.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CepResponseDto {
	
	private boolean erro;
	private String mensagem;
	private int total;
	private List<CepDataDto> dados;

}
