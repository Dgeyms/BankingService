package com.example.bankingservice.service;

import com.example.bankingservice.model.UserDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    public Optional createUsers(UserDto userDto);
}
