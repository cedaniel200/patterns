package com.cedaniel200.patterns.creational.abstractfactory;

import com.cedaniel200.patterns.creational.abstractfactory.model.Floor;
import com.cedaniel200.patterns.creational.abstractfactory.model.Roof;
import com.cedaniel200.patterns.creational.abstractfactory.model.Walls;

public interface HouseFactory {

    static void print(String character){
        System.out.println(character);
    }

    Roof buildRoof();
    Walls buildWalls();
    Floor buildFloor();

}
