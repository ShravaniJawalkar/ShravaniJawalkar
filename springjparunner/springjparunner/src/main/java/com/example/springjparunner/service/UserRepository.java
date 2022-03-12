package com.example.springjparunner.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjparunner.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
