package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
    private Long id;
    // USER FIRST NAME NOT NULL OR EMPTY
    @NotEmpty(message = "USER FIRST NAME NOT NULL OR EMPTY")
    private String firstName;
    // USER LAST NAME NOT NULL OR EMPTY
    @NotEmpty(message = "USER LAST NAME NOT NULL OR EMPTY")
    private String lastName;
    // USER EMAIL NOT NULL OR EMPTY
    // EMAIL IS VALID
    @NotEmpty(message = "USER EMAIL NOT NULL OR EMPTY")
    @Email(message = "EMAIL IS VALID")
    private String email;
}
