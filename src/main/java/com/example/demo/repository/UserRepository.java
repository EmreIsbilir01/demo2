package com.example.yourproject.repository;

import com.example.yourproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Find a user by their email address
    User findByEmail(String email);
}
