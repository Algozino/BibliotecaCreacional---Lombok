package com.biblioteca.abstractfactory;

public class EnvioNormal implements MetodoEnvio {
    @Override
    public void enviar(String detalle) {
        System.out.println("[Envio Normal] Enviando: " + detalle + ". Tiempo estimado: 5-7 días.");
    }
}
