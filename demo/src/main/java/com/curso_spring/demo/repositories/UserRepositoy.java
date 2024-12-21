package com.curso_spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso_spring.demo.entities.User;

public interface UserRepositoy  extends JpaRepository<User,Long>{}
