package com.example.bankingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional findByLogin(String login);

    Optional findByTelethon(String telephone);

    Optional findByEmail(String email);
}
