package com.cedaniel200.patterns.creational.factorymethod;

import static com.cedaniel200.patterns.creational.factorymethod.Transport.showInControlPanel;

public class Bus implements Transport {

    @Override
    public void startTrip() {
        showInControlPanel("Start the bus");
    }

    @Override
    public void finalTrip() {
        showInControlPanel("Stop the bus");
    }
}