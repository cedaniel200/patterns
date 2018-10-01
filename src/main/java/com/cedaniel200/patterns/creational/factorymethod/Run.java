package com.cedaniel200.patterns.creational.factorymethod;

public class Run {

    public static void main(String[] args) {
        tripInTheTourismAgencyFliesQuiet();
        tripInTheTourismAgencyMerryWay();
    }

    private static void tripInTheTourismAgencyFliesQuiet() {
        new TourismAgencyFliesQuiet().travel();
    }

    private static void tripInTheTourismAgencyMerryWay() {
        new TourismAgencyMerryWay().travel();
    }
}
