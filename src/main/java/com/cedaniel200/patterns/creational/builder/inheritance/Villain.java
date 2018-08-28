package com.cedaniel200.patterns.creational.builder.inheritance;

import java.util.List;

public class Villain extends Person {

    private List<String> weapons;

    public Villain(VillainBuilder builder) {
        super(builder);
        weapons = builder.getWeapons();
    }

    public List<String> getWeapons() {
        return weapons;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "weapons=" + weapons +
                "} " + super.toString();
    }
}
