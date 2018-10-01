package com.cedaniel200.patterns.creational.factorymethod;

public class TourismAgencyFliesQuiet extends TourismAgency {
    @Override
    protected Transport createTransport() {
        return new Airplane();
    }

}
