package com.baseproject.parameterization.model;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ParametroRepository extends JpaRepository<Parametro, Long> {

	Parametro findByNome(String nome);

	Optional<Parametro> findByUuid(String uuid);

	List<Parametro> findByNomeContainingIgnoreCase(String name, Pageable pageable);
	
	List<Parametro> findByFuncionalidade(Funcionalidade func);


}
