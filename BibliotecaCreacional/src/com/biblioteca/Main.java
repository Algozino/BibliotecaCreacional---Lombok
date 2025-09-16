package com.biblioteca;

import com.biblioteca.abstractfactory.*;
import com.biblioteca.builder.Usuario;
import com.biblioteca.factory.LogisticaLibro;
import com.biblioteca.factory.Libro;
import com.biblioteca.prototype.Prestamo;
import com.biblioteca.singleton.Database;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton");
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println("Misma instancia? " + (db1 == db2));

        Libro l1 = LogisticaLibro.crearFisico("fisico", "Terror", "Stephen King", 0.8);
        Libro l2 = LogisticaLibro.crearDigital("digital", "Fantasia", "Tolkien", 3.5);
        db1.agregarLibro(l1);
        db1.agregarLibro(l2);
        List<Libro> libros = db2.listarLibros();
        System.out.println("Libros en DB:");
        libros.forEach(System.out::println);

        System.out.println("\nFactory Method");
        Libro a = LogisticaLibro.crearFisico("fisico", "Aventura", "Jorgito", 0.5);
        Libro b = LogisticaLibro.crearDigital("digital", "Misterio", "Arturito", 5.2);
        System.out.println(a.getTitulo() + " -> " + a.getTipo());
        System.out.println(b.getTitulo() + " -> " + b.getTipo());

        System.out.println("\nAbstract Factory");
        UIFactory adminF = new AdminFactory();
        UIFactory userF = new UsuarioFactory();

        AbstractFactory adminUI = adminF.crearUI();
        MetodoEnvio adminEnvio = adminF.crearEnvio();
        adminUI.mostrarPantalla();
        adminEnvio.enviar("Pedido #1001");

        AbstractFactory userUI = userF.crearUI();
        MetodoEnvio userEnvio = userF.crearEnvio();
        userUI.mostrarPantalla();
        userEnvio.enviar("Pedido #1002");

        System.out.println("\nBuilder");
        Usuario u1 = Usuario.builder()
                .nombre("Juancito Panchito")
                .email("JuancitoPRO2003@.com")
                .direccion("Calle 100% REAL 123")
                .telefono("+54 9 266 4207 108")
                .fechaNacimiento(LocalDate.of(1990, 5, 12))
                .build();

        Usuario u2 = Usuario.builder()
                .nombre("Muñeco Gallardo")
                .email("GallardoCARP@gmail.com")
                // direccion y telefono omitidos a propósito (ojala conocer el telefono de gallardo)
                .build();

        System.out.println(u1);
        System.out.println(u2);

        System.out.println("\nPrototype");
        Prestamo prototipo = new Prestamo(l1, u1, LocalDate.now(), LocalDate.now().plusDays(14));
        Prestamo copia1 = prototipo.clone();
        Prestamo copia2 = prototipo.clone();

        System.out.println("Original: " + prototipo);
        System.out.println("Copia1: " + copia1);
        System.out.println("Copia2: " + copia2);

    }
}
