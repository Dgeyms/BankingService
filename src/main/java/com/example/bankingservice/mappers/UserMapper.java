package com.example.bankingservice.mappers;

import com.example.bankingservice.model.UserDto;
import com.example.bankingservice.repository.User;

public class UserMapper {

    public static User toEntity(UserDto userDto) {
        User user = new User();
        user.setIdUser(user.getIdUser());
        user.setLogin(userDto.getLogin());
        user.setPassword(userDto.getPassword());
        user.setInitialSum(userDto.getInitialSum());
        user.setTelephone(userDto.getTelephone());
        user.setEmail(userDto.getEmail());
        user.setDateOfBirth(userDto.getDateOfBirth());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setSurName(userDto.getSurName());
        return user;
    }
}
