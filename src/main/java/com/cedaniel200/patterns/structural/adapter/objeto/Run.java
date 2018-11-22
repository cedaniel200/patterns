package com.cedaniel200.patterns.structural.adapter.objeto;

public class Run {
    public static void main(String[] args) {
        adapterClase();
    }

    private static void adapterClase() {
        InstrumentoPercusion instrumento = new OllaTamborAdapter(new OllaPresion());
        instrumento.golpear().sonar();
    }
}
