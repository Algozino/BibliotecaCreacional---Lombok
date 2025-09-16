package com.biblioteca.abstractfactory;

public class UsuarioFactory implements UIFactory {
    @Override
    public AbstractFactory crearUI() {
        return new UsuarioUI();
    }

    @Override
    public MetodoEnvio crearEnvio() {
        // Se le asigna al user como ejemplo el envio normal
        return new EnvioNormal();
    }
}
