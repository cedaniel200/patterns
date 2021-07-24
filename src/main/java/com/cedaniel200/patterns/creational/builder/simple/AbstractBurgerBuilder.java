package com.cedaniel200.patterns.creational.builder.simple;

import com.cedaniel200.patterns.creational.builder.Builder;

abstract class AbstractBurgerBuilder implements Builder<Burger> {

    abstract AbstractBurgerBuilder withLettuce();
    abstract AbstractBurgerBuilder withBeef();
    abstract AbstractBurgerBuilder withPork();
    abstract AbstractBurgerBuilder withChicken();
    abstract AbstractBurgerBuilder addTomato(int amount);
    abstract AbstractBurgerBuilder addOnion(int amount);
    abstract AbstractBurgerBuilder addSlicesOfCheese(int amount);
}
