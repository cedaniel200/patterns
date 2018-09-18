package com.cedaniel200.patterns.creational.abstractfactory.model;

public interface Drawable {

    static void print(String character){
        System.out.println(character);
    }

    void paint();
}
