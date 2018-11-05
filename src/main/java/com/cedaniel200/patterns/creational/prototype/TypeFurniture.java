package com.cedaniel200.patterns.creational.prototype;

public enum TypeFurniture {
    COUCH("Couch"),
    TEA_TABLE("Tea table"),
    CHAIR("chair");

    private String name;

    TypeFurniture(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
