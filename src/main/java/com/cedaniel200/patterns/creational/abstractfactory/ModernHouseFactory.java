package com.cedaniel200.patterns.creational.abstractfactory;

import com.cedaniel200.patterns.creational.abstractfactory.model.Floor;
import com.cedaniel200.patterns.creational.abstractfactory.model.Roof;
import com.cedaniel200.patterns.creational.abstractfactory.model.Walls;

import static com.cedaniel200.patterns.creational.abstractfactory.model.Drawable.print;

public class ModernHouseFactory implements HouseFactory {

    @Override
    public Roof buildRoof() {
        return () -> {
            print("   /\\   ");
            print("  /  \\  ");
            print(" /____\\ ");
        };
    }

    @Override
    public Walls buildWalls() {
        return () -> {
            print(" :    : ");
            print(" : || : ");
            print(" : || : ");
        };
    }

    @Override
    public Floor buildFloor() {
        return () -> print("--------");
    }
}
