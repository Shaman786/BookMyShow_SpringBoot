package com.learning.bookmyshow.repositories;

import com.learning.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long userId);

    Optional<User> findByEmail(String email);

    @Override
    User save(User user);
}
