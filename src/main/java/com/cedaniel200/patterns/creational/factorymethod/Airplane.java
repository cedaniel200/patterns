package com.cedaniel200.patterns.creational.factorymethod;

import static com.cedaniel200.patterns.creational.factorymethod.Transport.showInControlPanel;

public class Airplane implements Transport {

    @Override
    public void startTrip() {
        showInControlPanel("The plane takes off");
    }

    @Override
    public void finalTrip() {
        showInControlPanel("The plane lands");
    }
}
