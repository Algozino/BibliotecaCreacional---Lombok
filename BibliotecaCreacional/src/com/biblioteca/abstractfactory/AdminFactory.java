package com.biblioteca.abstractfactory;

public class AdminFactory implements UIFactory {
    @Override
    public AbstractFactory crearUI() {
        return new AdminUI();
    }

    @Override
    public MetodoEnvio crearEnvio() {
        // Se le asigna al admin como ejemplo el envio express
        return new EnvioExpress();
    }
}
