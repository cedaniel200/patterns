package com.cedaniel200.patterns.creational.factorymethod;

public class TourismAgencyMerryWay extends TourismAgency {
    @Override
    protected Transport createTransport() {
        return new Bus();
    }
}
