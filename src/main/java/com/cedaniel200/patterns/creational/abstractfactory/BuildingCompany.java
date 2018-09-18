package com.cedaniel200.patterns.creational.abstractfactory;

import com.cedaniel200.patterns.creational.abstractfactory.model.House;

public class BuildingCompany {

    private HouseFactory houseFactory;

    public void setHouseFactory(HouseFactory houseFactory){
        this.houseFactory = houseFactory;
    }

    public House buildHouse(){
        return new House(
                houseFactory.buildRoof(),
                houseFactory.buildWalls(),
                houseFactory.buildFloor()
        );
    }

}
