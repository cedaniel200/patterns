package com.cedaniel200.patterns.structural.adapter.clase;

public class Sonido {
    private String sonido;

    public Sonido() {
        sonido = "PLOT PLOT";
    }

    public Sonido(String sonido) {
        this.sonido = sonido;
    }

    public void sonar(){
        System.out.println(sonido);
    }
}
