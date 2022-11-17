package com.baseproject.auth.dto;

import com.baseproject.parameterization.model.Parametro;
import lombok.Data;

import java.util.List;

@Data
public class SessionDto {
	private String nomeUser;
	private Long idUser;
	private List<Parametro> parametros;
}
