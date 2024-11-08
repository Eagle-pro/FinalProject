package com.example.librarymanagmentsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDTO {
    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String password;

}
