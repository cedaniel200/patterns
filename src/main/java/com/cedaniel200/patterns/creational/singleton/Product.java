package com.cedaniel200.patterns.creational.singleton;

public class Product {

    private static Product product;

    private Product() {    }

    public static Product getInstance(){
        if(product == null){
            product = new Product();
        }
        return product;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
