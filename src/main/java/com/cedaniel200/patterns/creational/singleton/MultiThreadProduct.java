package com.cedaniel200.patterns.creational.singleton;

public class MultiThreadProduct {

    private static MultiThreadProduct multiThreadProduct;

    private MultiThreadProduct() {    }

    public static MultiThreadProduct getInstance(){
        if(multiThreadProduct == null){
            synchronized(MultiThreadProduct.class){
                if(multiThreadProduct == null){
                    multiThreadProduct = new MultiThreadProduct();
                }
            }
        }
        return multiThreadProduct;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
