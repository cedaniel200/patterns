package com.cedaniel200.patterns.creational.builder.inheritance;

import java.util.ArrayList;
import java.util.List;

public class SuperHeroBuilder extends PersonBuilder<SuperHeroBuilder> {

    private List<String> superpowers;

    public SuperHeroBuilder() {
        this.superpowers = new ArrayList<>();
    }

    public static SuperHeroBuilder superHero() {
        return new SuperHeroBuilder();
    }

    public SuperHeroBuilder addSuperpower(String superpower){
        superpowers.add(superpower);
        return this;
    }

    public List<String> getSuperpowers() {
        return superpowers;
    }

    @Override
    public SuperHero build(){
        return new SuperHero(this);
    }
}
