package com.biblioteca.factory;

import lombok.Builder;
import lombok.Value;

@Value
@Builder

public class LibroDigital implements Libro {
    String tipo;
    String titulo;
    String autor;
    double tamanioMB; // atributo específico

    @Override
    public String getTipo() { return "Digital"; }

    @Override
    public Libro clone() {
        return new LibroDigital(tipo, titulo, autor, tamanioMB);
    }
}