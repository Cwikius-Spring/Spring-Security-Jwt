package com.ossez.spring.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ossez.spring.security.models.entity.Person;

@Repository
public interface UserRepository extends JpaRepository<Person, Long> {
  Optional<Person> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
