package com.cedaniel200.patterns.structural.adapter.objeto;

public class OllaPresion implements Olla {

    @Override
    public Sonido hacerSonar(){
        return new Sonido("Plin Plin");
    }

    @Override
    public void cocinar(String comida){
        System.out.println("Concinando " + comida);
    }

}
