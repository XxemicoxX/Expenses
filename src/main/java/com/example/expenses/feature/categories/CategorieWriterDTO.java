package com.example.expenses.feature.categories;

public record CategorieWriterDTO(
    Logn id,
    @NotBlank(message = "Debe ingresar el nombre")
    String name,
    @NotBlank(message = "Ingrese una descripcion breve")
    String description
) {
    
}
