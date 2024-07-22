package com.example.bankingservice.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
public class UserDto {

    @NotBlank(message = "Login cannot be blank")
    private String login;

    @Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters")
    @NotBlank(message = "Password cannot be blank")
    private String password;

    @Positive(message = "Initial sum must be positive")
    private int initialSum;

    @Size(min = 10, max = 10, message = "Telephone number must be between 10 characters")
    private String telephone;

    @Email(message = "Email should be valid")
    private String email;

    @Past(message = "Date of birth must be in the past")
    private Date dateOfBirth;

    @NotBlank(message = "Last name cannot be blank")
    private String lastName;

    @NotBlank(message = "First name cannot be blank")
    private String firstName;

    @NotBlank(message = "Sur name cannot be blank")
    private String surName;
}
