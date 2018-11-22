package com.cedaniel200.patterns.structural.adapter.clase;

public class OllaPresion implements Olla {

    @Override
    public Sonido hacerSonar(){
        return new Sonido();
    }

    @Override
    public void cocinar(String comida){
        System.out.println("Concinando " + comida);
    }

}
