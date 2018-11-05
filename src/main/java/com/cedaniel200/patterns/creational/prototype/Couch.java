package com.cedaniel200.patterns.creational.prototype;

public class Couch implements Furniture, Cloneable {

    @Override
    public String getDescription() {
        return getClass().getSimpleName() + " " + toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
