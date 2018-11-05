package com.cedaniel200.patterns.creational.prototype;

public class TeaTable implements Furniture {
    @Override
    public String getDescription() {
        return getClass().getSimpleName() + " " + toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
