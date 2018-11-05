package com.cedaniel200.patterns.creational.prototype;

import java.util.Map;

public class Carpenter {

    private Map<TypeFurniture, Furniture> furnitureMap;

    public Carpenter(Map<TypeFurniture, Furniture> furnitureMap){
        this.furnitureMap = furnitureMap;
    }

    public Furniture createFurniture(TypeFurniture typeFurniture) throws CloneNotSupportedException {
        Furniture furniture = furnitureMap.get(typeFurniture);
        return (Furniture) furniture.clone();
    }

}
