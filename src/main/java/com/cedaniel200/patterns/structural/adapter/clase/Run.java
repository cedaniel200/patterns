package com.cedaniel200.patterns.structural.adapter.clase;

public class Run {
    public static void main(String[] args) {
        adapterClase();
    }

    private static void adapterClase() {
        InstrumentoPercusion instrumento = new OllaTamborAdapter();
        instrumento.golpear().sonar();
    }

}
