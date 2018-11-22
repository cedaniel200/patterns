package com.cedaniel200.patterns.structural.adapter.objeto;

public class OllaTamborAdapter implements InstrumentoPercusion {
    private Olla olla;

    public OllaTamborAdapter(Olla olla) {
        this.olla = olla;
    }

    @Override
    public Sonido golpear() {
        return olla.hacerSonar();
    }
}
