package com.cedaniel200.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import static com.cedaniel200.patterns.creational.prototype.TypeFurniture.CHAIR;
import static com.cedaniel200.patterns.creational.prototype.TypeFurniture.COUCH;
import static com.cedaniel200.patterns.creational.prototype.TypeFurniture.TEA_TABLE;

public class Run {

    public static void main(String[] args) throws CloneNotSupportedException {
        Map<TypeFurniture, Furniture> furnitureMap = new HashMap<>();
        furnitureMap.put(COUCH, new Couch());
        furnitureMap.put(CHAIR, new Chair());
        furnitureMap.put(TEA_TABLE, new TeaTable());
        Carpenter carpenter = new Carpenter(furnitureMap);

        System.out.println(carpenter.createFurniture(COUCH).getDescription());
        System.out.println(carpenter.createFurniture(COUCH).getDescription());
        System.out.println(carpenter.createFurniture(CHAIR).getDescription());
        System.out.println(carpenter.createFurniture(CHAIR).getDescription());
        System.out.println(carpenter.createFurniture(TEA_TABLE).getDescription());
        System.out.println(carpenter.createFurniture(TEA_TABLE).getDescription());
    }

}
