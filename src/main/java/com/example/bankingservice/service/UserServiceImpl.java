package com.example.bankingservice.service;

import com.example.bankingservice.model.UserDto;
import com.example.bankingservice.repository.User;
import com.example.bankingservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> createUsers(UserDto userDto) {
        // Search user login
        Optional existingUser = userRepository.findByLogin(userDto.getLogin());
        if (existingUser.isPresent()){
            return Optional.empty();
        }else {
            User user = new User(userDto);
            userRepository.save(user);
            return Optional.of(user);
        }
    }
}
