package com.biblioteca.abstractfactory;

public class EnvioExpress implements MetodoEnvio {
    @Override
    public void enviar(String detalle) {
        System.out.println("[Envio Express] Enviando: " + detalle + ". Tiempo estimado: 1-2 días.");
    }
}
