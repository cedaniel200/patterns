package com.cedaniel200.patterns.creational.builder.inheritance;

import java.util.ArrayList;
import java.util.List;

public class VillainBuilder extends PersonBuilder<VillainBuilder> {

    private List<String> weapons;

    public VillainBuilder() {
        this.weapons = new ArrayList<>();
    }

    public static VillainBuilder villain(){
        return new VillainBuilder();
    }

    public VillainBuilder addWeapon(String weapon){
        weapons.add(weapon);
        return this;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    @Override
    public Villain build(){
        return new Villain(this);
    }

}
