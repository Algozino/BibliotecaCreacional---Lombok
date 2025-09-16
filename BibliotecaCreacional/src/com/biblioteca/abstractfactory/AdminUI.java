package com.biblioteca.abstractfactory;

public class AdminUI implements AbstractFactory {
    @Override
    public void mostrarPantalla() {
        System.out.println("[Admin] Panel de administración: gestión de libros y usuarios.");
    }
}
