package com.cedaniel200.patterns.creational.singleton;

public class Run {

    public static void main(String[] args) {
        Product productA = Product.getInstance();
        Product productB = Product.getInstance();

        System.out.println(productA.equals(productB));

        MultiThreadProduct multiThreadProductA = MultiThreadProduct.getInstance();
        MultiThreadProduct multiThreadProductB = MultiThreadProduct.getInstance();

        System.out.println(multiThreadProductA.equals(multiThreadProductB));
    }
}