package com.example.bankingservice.controller;

import com.example.bankingservice.model.UserDto;
import com.example.bankingservice.repository.User;
import com.example.bankingservice.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.bankingservice.mappers.UserMapper.toEntity;

@RestController
@RequestMapping("/api/users")
@Validated
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public void user(@Validated @RequestBody UserDto userDto){
        User user = toEntity(userDto);
        userService.createUsers(user);

    }
}
