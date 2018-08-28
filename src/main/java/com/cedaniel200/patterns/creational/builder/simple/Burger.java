package com.cedaniel200.patterns.creational.builder.simple;

public class Burger {

    private static final int AMOUNT_BREADS = 2;

    private boolean hasLettuce;
    private boolean hasBeef;
    private boolean hasPork;
    private boolean hasChicken;
    private int amountTomato;
    private int amountOnion;
    private int amountSlicesOfCheese;

    public Burger(BurgerBuilder burgerBuilder) {
        this.hasLettuce = burgerBuilder.hasLettuce();
        this.hasBeef = burgerBuilder.hasBeef();
        this.hasPork = burgerBuilder.hasPork();
        this.hasChicken = burgerBuilder.isHasChicken();
        this.amountTomato = burgerBuilder.getAmountTomato();
        this.amountOnion = burgerBuilder.getAmountOnion();
        this.amountSlicesOfCheese = burgerBuilder.getAmountSlicesOfCheese();
    }

    public static int getAmountBreads() {
        return AMOUNT_BREADS;
    }

    public boolean hasLettuce() {
        return hasLettuce;
    }

    public boolean hasBeef() {
        return hasBeef;
    }

    public boolean hasPork() {
        return hasPork;
    }

    public boolean hasChicken() {
        return hasChicken;
    }

    public int getAmountTomato() {
        return amountTomato;
    }

    public int getAmountOnion() {
        return amountOnion;
    }

    public int getAmountSlicesOfCheese() {
        return amountSlicesOfCheese;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "amountBread=" + AMOUNT_BREADS +
                ", hasLettuce=" + hasLettuce +
                ", hasBeef=" + hasBeef +
                ", hasPork=" + hasPork +
                ", hasChicken=" + hasChicken +
                ", amountTomato=" + amountTomato +
                ", amountOnion=" + amountOnion +
                ", amountSlicesOfCheese=" + amountSlicesOfCheese +
                '}';
    }
}
