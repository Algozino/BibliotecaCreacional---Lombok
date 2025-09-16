package com.biblioteca.factory;

import lombok.Builder;
import lombok.Value;

@Value
@Builder

public class LibroFisico implements Libro {
    String tipo;
    String titulo;
    String autor;
    double pesoKg; // atributo específico

    @Override
    public String getTipo() { return "Físico"; }

    @Override
    public Libro clone() {
        return new LibroFisico(tipo, titulo, autor, pesoKg);
    }
}
