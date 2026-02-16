package com.example.expenses.feature.users;

import com.example.expenses.util.RoleSystem;

public record UserReaderDTO(
    Long id,
    String nombre,
    String email,
    String contrasena,
    RoleSystem role
) {
    
}
