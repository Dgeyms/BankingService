package com.example.bankingservice.controller;

import com.example.bankingservice.BalanceUser;
import com.example.bankingservice.model.UserDto;
import com.example.bankingservice.repository.User;
import com.example.bankingservice.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.util.Optional;

import static com.example.bankingservice.mappers.UserMapper.toEntity;

@RestController
@RequestMapping("/api/users")
@Validated
public class NewUserController {
    private UserService userService;
    private BalanceUser balanceUser;

    public NewUserController(UserService userService, BalanceUser balanceUser) {
        this.userService = userService;
        this.balanceUser = balanceUser;
    }

    @PostMapping("/register")
    public ResponseEntity<String> user(@Validated @RequestBody UserDto userDto) {
        // Преобразование DTO в сущность
        User user = toEntity(userDto);

        // Установка начальной суммы
        user.setInitialSum(user.getInitialSum());

        // Сохранение пользователя
        Optional<User> createdUser = userService.createUsers(user);

        if (createdUser.isPresent()) {
            // Пользователь успешно создан
            return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
        } else {
            // Такой Пользователь уже есть
            return new ResponseEntity<>("User with the given login, email, or telephone already exists", HttpStatus.CONFLICT);
        }
    }
}
