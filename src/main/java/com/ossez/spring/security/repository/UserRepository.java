package com.ossez.spring.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ossez.spring.security.models.entity.Person;

@Repository
public interface UserRepository extends CrudRepository<Person, Long> {
  Optional<Person> findByUserName(String userName);

  Boolean existsByUserName(String userName);

  Boolean existsByUserEmail(String userEmail);
}
