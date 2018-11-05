package com.cedaniel200.patterns.creational.prototype;

public interface Furniture extends Cloneable {
    String getDescription();
    Object clone() throws CloneNotSupportedException;
}
