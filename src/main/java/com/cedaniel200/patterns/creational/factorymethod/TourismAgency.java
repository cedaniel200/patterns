package com.cedaniel200.patterns.creational.factorymethod;

public abstract class TourismAgency {

    abstract Transport createTransport();

    protected void travel(){
        Transport transport = createTransport();
        transport.startTrip();
        transport.finalTrip();
    }
}
