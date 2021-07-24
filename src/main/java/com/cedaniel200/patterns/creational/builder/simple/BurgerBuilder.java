package com.cedaniel200.patterns.creational.builder.simple;

public class BurgerBuilder extends AbstractBurgerBuilder {

    private Burger burger;

    private BurgerBuilder() {
        this.burger = new Burger();
    }

    public static BurgerBuilder burger(){
        return new BurgerBuilder();
    }

    @Override
    public BurgerBuilder withLettuce(){
        this.burger.setHasLettuce(true);
        return this;
    }

    @Override
    public BurgerBuilder withBeef(){
        this.burger.setHasBeef(true);
        return this;
    }

    @Override
    public BurgerBuilder withPork(){
        this.burger.setHasPork(true);
        return this;
    }

    @Override
    public BurgerBuilder withChicken(){
        this.burger.setHasChicken(true);
        return this;
    }

    @Override
    public BurgerBuilder addTomato(int amount){
        this.burger.setAmountTomato(amount);
        return this;
    }

    @Override
    public BurgerBuilder addOnion(int amount){
        this.burger.setAmountOnion(amount);
        return this;
    }

    @Override
    public BurgerBuilder addSlicesOfCheese(int amount){
        this.burger.setAmountSlicesOfCheese(amount);
        return this;
    }

    @Override
    public Burger build() {
        return this.burger;
    }

}
