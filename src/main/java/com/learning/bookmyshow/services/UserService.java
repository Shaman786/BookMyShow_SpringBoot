package com.learning.bookmyshow.services;

import com.learning.bookmyshow.models.User;
import com.learning.bookmyshow.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(String name, String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        User savedUser = null;

        if (optionalUser.isPresent()) {
//    call the login function.
        } else {//Create a User object and save to DB.
            User user = new User();
            user.setName(name);
            user.setEmail(email);

//    BCryptPasswordEncoder.
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            user.setPassword(bCryptPasswordEncoder.encode(password));
            savedUser = userRepository.save(user);
        }
        return savedUser;
    }
}