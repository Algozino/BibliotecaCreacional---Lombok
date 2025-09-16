package com.biblioteca.factory;

public class LogisticaLibro {
    public static Libro crearDigital(String tipo, String titulo, String autor, double tamanioMB) {
        return LibroDigital.builder()
                .tipo("Digital")
                .titulo(titulo)
                .autor(autor)
                .tamanioMB(tamanioMB)
                .build();
    }


    public static Libro crearFisico(String tipo, String titulo, String autor, double pesoKg) {
        return LibroFisico.builder()
                .tipo("Físico")
                .titulo(titulo)
                .autor(autor)
                .pesoKg(pesoKg)
                .build();
    }
}