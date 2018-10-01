package com.cedaniel200.patterns.creational.factorymethod;

public interface Transport {

    static void showInControlPanel(String message){
        System.out.println(message);
    }

    void startTrip();
    void finalTrip();
}
