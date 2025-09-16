package com.biblioteca.abstractfactory;

public class UsuarioUI implements AbstractFactory {
    @Override
    public void mostrarPantalla() {
        System.out.println("[Usuario] Inicio: catálogo y préstamos.");
    }
}
