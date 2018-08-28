package com.cedaniel200.patterns.creational.builder.simple;

import com.cedaniel200.patterns.creational.builder.Builder;

public class BurgerBuilder implements Builder<Burger> {

    private boolean hasLettuce;
    private boolean hasBeef;
    private boolean hasPork;
    private boolean hasChicken;
    private int amountTomato;
    private int amountOnion;
    private int amountSlicesOfCheese;

    public BurgerBuilder() {
        this.hasLettuce = false;
        this.hasBeef = false;
        this.hasPork = false;
        this.hasChicken = false;
        this.amountTomato = 0;
        this.amountOnion = 0;
        this.amountSlicesOfCheese = 0;
    }

    public static BurgerBuilder burger(){
        return new BurgerBuilder();
    }

    public BurgerBuilder withLettuce(){
        this.hasLettuce = true;
        return this;
    }

    public BurgerBuilder withBeef(){
        this.hasBeef = true;
        return this;
    }

    public BurgerBuilder withPork(){
        this.hasPork = true;
        return this;
    }

    public BurgerBuilder withChicken(){
        this.hasChicken = true;
        return this;
    }

    public BurgerBuilder addTomato(int amount){
        this.amountTomato = amount;
        return this;
    }

    public BurgerBuilder addOnion(int amount){
        this.amountOnion = amount;
        return this;
    }

    public BurgerBuilder addSlicesOfCheese(int amount){
        this.amountSlicesOfCheese = amount;
        return this;
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

    public boolean isHasChicken() {
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
    public Burger build() {
        return new Burger(this);
    }

}
