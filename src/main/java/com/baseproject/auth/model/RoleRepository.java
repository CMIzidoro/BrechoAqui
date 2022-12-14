package com.baseproject.auth.model;

import com.baseproject.auth.enumerator.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(Roles roleName);

}
