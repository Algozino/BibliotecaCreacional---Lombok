package com.biblioteca.singleton;

import com.biblioteca.factory.Libro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Database {
    private Database() {
        this.libros = new ArrayList<>();
    }

    private final List<Libro> libros;

    private static class Holder {
        private static final Database INSTANCE = new Database();
    }

    public static Database getInstance() {
        return Holder.INSTANCE;
    }

    public synchronized void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> listarLibros() {
        return Collections.unmodifiableList(libros);
    }

    public void clear() {
        libros.clear();
    }
}
