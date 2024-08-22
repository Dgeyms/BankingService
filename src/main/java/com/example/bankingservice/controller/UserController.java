package com.example.bankingservice.controller;

import com.example.bankingservice.model.UserDto;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@Validated
public class UserController {

    // add telethon and email user
    @PostMapping("/dataUser")
    public void addDataUser(@Valid @RequestBody UserDto userDto) {

    }

}
