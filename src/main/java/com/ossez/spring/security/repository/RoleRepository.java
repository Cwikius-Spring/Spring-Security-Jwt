package com.ossez.spring.security.repository;

import java.util.Optional;

import com.ossez.spring.security.models.ERole;
import com.ossez.spring.security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
