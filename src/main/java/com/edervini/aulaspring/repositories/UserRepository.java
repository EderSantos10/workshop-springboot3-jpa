package com.edervini.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edervini.aulaspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
