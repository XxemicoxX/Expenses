package com.example.expenses.util;

public interface Mapper<E, DW, DR>{    
    E toEntity(DW dto);
    DR toDto(E entity);
}
    
