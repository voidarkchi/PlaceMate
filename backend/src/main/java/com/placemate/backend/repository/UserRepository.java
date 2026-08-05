package com.placemate.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placemate.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}