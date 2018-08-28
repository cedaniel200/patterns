package com.cedaniel200.patterns.creational.builder.simple;

import static com.cedaniel200.patterns.creational.builder.simple.BurgerBuilder.burger;

public class Run {

    public static void main(String[] args) {
        burgerByDefault();
        burgerExample();
        yourBurger();

    }

    private static void yourBurger() {
        // TODO Create your hamburger to your liking
    }

    private static void burgerByDefault() {
        Burger burgerDefault = burger().build();
        showBurger("burger by default", burgerDefault);
    }

    private static void burgerExample() {
        Burger burgerExample = burger()
                .withPork()
                .withChicken()
                .addTomato(2)
                .addSlicesOfCheese(2)
                .build();
        showBurger("burger example", burgerExample);
    }

    private static void showBurger(String message, Burger burger) {
        System.out.println(message + "\n" + burger.toString());
    }

}
