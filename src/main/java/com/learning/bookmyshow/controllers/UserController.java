package com.learning.bookmyshow.controllers;

import com.learning.bookmyshow.dtos.ResponseStatus;
import com.learning.bookmyshow.dtos.SignUpRequestDto;
import com.learning.bookmyshow.dtos.SignUpResponseDto;
import com.learning.bookmyshow.models.User;
import com.learning.bookmyshow.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
        SignUpResponseDto responseDto = new SignUpResponseDto();

        try {
            User user = userService.signUp(
                    requestDto.getName(),
                    requestDto.getEmail(),
                    requestDto.getPassword()
            );
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setUser(user);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
