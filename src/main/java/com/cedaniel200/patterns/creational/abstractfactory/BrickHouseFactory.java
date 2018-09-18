package com.cedaniel200.patterns.creational.abstractfactory;

import com.cedaniel200.patterns.creational.abstractfactory.model.Floor;
import com.cedaniel200.patterns.creational.abstractfactory.model.Roof;
import com.cedaniel200.patterns.creational.abstractfactory.model.Walls;

import static com.cedaniel200.patterns.creational.abstractfactory.HouseFactory.print;

public class BrickHouseFactory implements HouseFactory {

    @Override
    public Roof buildRoof() {
        return new Roof( () -> { print(" ______ "); } );
    }

    @Override
    public Walls buildWalls() {
        return new Walls( () -> {
            print(" :    : ");
            print(" : || : ");
            print(" : || : ");
        } );
    }

    @Override
    public Floor buildFloor() {
        return new Floor( () -> { print("--------"); } );
    }

}
