package com.cedaniel200.patterns.structural.adapter.clase;

public class OllaTamborAdapter extends OllaPresion implements InstrumentoPercusion {

    @Override
    public Sonido golpear() {
        return super.hacerSonar();
    }
}
