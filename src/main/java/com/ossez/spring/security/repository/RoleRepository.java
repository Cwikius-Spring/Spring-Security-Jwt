package com.ossez.spring.security.repository;

import java.util.Optional;

import com.ossez.spring.security.models.ERole;
import com.ossez.spring.security.models.entity.PersonRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<PersonRole, Long> {
  Optional<PersonRole> findByPersonRoleKey(ERole name);
}
