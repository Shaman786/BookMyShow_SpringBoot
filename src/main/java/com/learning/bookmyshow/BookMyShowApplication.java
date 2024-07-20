package com.learning.bookmyshow;

import com.learning.bookmyshow.controllers.UserController;
import com.learning.bookmyshow.dtos.SignUpRequestDto;
import com.learning.bookmyshow.dtos.SignUpResponseDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowApplication implements CommandLineRunner {
    private final UserController userController;

    public BookMyShowApplication(UserController userController) {
        this.userController = userController;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDto requestDto = new SignUpRequestDto();
        requestDto.setName("Fayaj");
        requestDto.setEmail("Fayaj@google.com");
        requestDto.setPassword("password123");

        SignUpResponseDto responseDto = userController.signUp(requestDto);
    }
}