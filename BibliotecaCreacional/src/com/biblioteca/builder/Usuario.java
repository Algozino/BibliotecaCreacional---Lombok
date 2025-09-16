package com.biblioteca.builder;

import lombok.Builder;
import lombok.Value;
import java.time.LocalDate;

@Value
@Builder(toBuilder = true)

public class Usuario implements Cloneable {
    String nombre;
    String email;
    String direccion;
    String telefono;
    LocalDate fechaNacimiento;

    @Override
    public Usuario clone() {
        return this.toBuilder().build();
    }
}