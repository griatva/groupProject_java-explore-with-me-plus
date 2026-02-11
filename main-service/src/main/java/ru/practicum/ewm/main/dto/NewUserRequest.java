package ru.practicum.ewm.main.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewUserRequest {

    @Size(min = 2, max = 250, message = "User name must be between 2 and 250 characters")
    @NotBlank(message = "User name must not be empty")
    private String name;

    @Email(message = "Email address must be valid")
    @Size(min = 6, max = 254, message = "Email address must be between 6 and 254 characters")
    @NotBlank(message = "Email address must not be empty")
    private String email;
}