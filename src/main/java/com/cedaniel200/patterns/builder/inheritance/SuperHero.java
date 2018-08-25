package com.cedaniel200.patterns.builder.inheritance;

import java.util.List;

public class SuperHero extends Person {

    private List<String> superpowers;

    public SuperHero(SuperHeroBuilder builder) {
        super(builder);
        superpowers = builder.getSuperpowers();
    }

    public List<String> getSuperpowers() {
        return superpowers;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "superpowers=" + superpowers +
                "} " + super.toString();
    }
}
