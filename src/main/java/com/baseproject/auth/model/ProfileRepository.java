package com.baseproject.auth.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

	Profile findProfileByName(String nome);

	Optional<Profile> findByUuid(String uuid);

	List<Profile> findByNameContainingIgnoreCase(String name);

}
