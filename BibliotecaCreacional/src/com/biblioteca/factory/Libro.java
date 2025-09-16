package com.biblioteca.factory;

public interface Libro extends Cloneable {
    String getTitulo();
    String getAutor();
    String getTipo();
    Libro clone();
}
