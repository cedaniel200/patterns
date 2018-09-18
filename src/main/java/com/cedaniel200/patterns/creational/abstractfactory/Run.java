package com.cedaniel200.patterns.creational.abstractfactory;

public class Run {

    public static void main(String[] args) {
        BuildingCompany buildingCompany = new BuildingCompany();

        buildingCompany.setHouseFactory(new StoneHouseFactory());
        buildingCompany.buildHouse().paint();

        buildingCompany.setHouseFactory(new WoodenHousesFactory());
        buildingCompany.buildHouse().paint();

        buildingCompany.setHouseFactory(new BrickHouseFactory());
        buildingCompany.buildHouse().paint();

        buildingCompany.setHouseFactory(new ModernHouseFactory());
        buildingCompany.buildHouse().paint();
    }

}
