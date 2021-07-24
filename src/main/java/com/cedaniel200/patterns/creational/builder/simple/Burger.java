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

    public static int getAmountBreads() {
        return AMOUNT_BREADS;
    }

    public boolean hasLettuce() {
        return hasLettuce;
    }

    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }

    public boolean hasBeef() {
        return hasBeef;
    }

    public void setHasBeef(boolean hasBeef) {
        this.hasBeef = hasBeef;
    }

    public boolean hasPork() {
        return hasPork;
    }

    public void setHasPork(boolean hasPork) {
        this.hasPork = hasPork;
    }

    public boolean hasChicken() {
        return hasChicken;
    }

    public void setHasChicken(boolean hasChicken) {
        this.hasChicken = hasChicken;
    }

    public int getAmountTomato() {
        return amountTomato;
    }

    public void setAmountTomato(int amountTomato) {
        this.amountTomato = amountTomato;
    }

    public int getAmountOnion() {
        return amountOnion;
    }

    public void setAmountOnion(int amountOnion) {
        this.amountOnion = amountOnion;
    }

    public int getAmountSlicesOfCheese() {
        return amountSlicesOfCheese;
    }

    public void setAmountSlicesOfCheese(int amountSlicesOfCheese) {
        this.amountSlicesOfCheese = amountSlicesOfCheese;
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
