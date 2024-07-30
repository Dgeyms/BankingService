package com.example.bankingservice.service;

import com.example.bankingservice.exception.UserAlreadyExistsException;
import com.example.bankingservice.repository.User;
import com.example.bankingservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> createUsers(User user) {
        // Search user login, telethon, email,
        Optional existingUser = userRepository.findByLogin(user.getLogin());
        Optional existingTelethon = userRepository.findByTelethon(user.getTelephone());
        Optional existingEmail = userRepository.findByEmail(user.getEmail());

        if (existingUser.isPresent()) {
            throw new UserAlreadyExistsException("User with login :" + user.getLogin() + " already exists");
        } else if (existingTelethon.isPresent()) {
            throw new UserAlreadyExistsException("User with telethon :" + user.getTelephone() + " already exists");
        } else if (existingEmail.isPresent()) {
            throw new UserAlreadyExistsException("User with email :" + user.getEmail() + " already exists");
        } else {
            userRepository.save(user);
            return Optional.of(user);
        }
    }
}
