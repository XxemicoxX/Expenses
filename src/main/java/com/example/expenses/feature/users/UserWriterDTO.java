package com.example.expenses.feature.users;

import com.example.expenses.util.RoleSystem;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public record UserWriterDTO(
    Long id,
    @NotBlank(message = "Debes ingresar el nombre")
    String name,
    @Email(message = "Correo invalido")
    String email,
    @NotBlank(message = "Debes ingresar una contraseña")
    String password,
    RoleSystem role
) {
    
}
