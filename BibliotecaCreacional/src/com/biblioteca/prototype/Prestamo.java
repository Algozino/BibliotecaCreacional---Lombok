package com.biblioteca.prototype;

import com.biblioteca.factory.Libro;
import com.biblioteca.builder.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@ToString

public class Prestamo implements Cloneable {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @Override
    public Prestamo clone() {
        Libro libroCopia = libro != null ? libro.clone() : null;
        Usuario usuarioCopia = usuario != null ? usuario.clone() : null;
        LocalDate inicioCopia = fechaInicio != null
                ? LocalDate.of(fechaInicio.getYear(), fechaInicio.getMonth(), fechaInicio.getDayOfMonth())
                : null;
        LocalDate finCopia = fechaFin != null
                ? LocalDate.of(fechaFin.getYear(), fechaFin.getMonth(), fechaFin.getDayOfMonth())
                : null;

        return new Prestamo(libroCopia, usuarioCopia, inicioCopia, finCopia);
    }
    @Override
    public String toString() {
        return "Prestamo{libro=" + libro + ", usuario=" + usuario + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "}";
    }
}
