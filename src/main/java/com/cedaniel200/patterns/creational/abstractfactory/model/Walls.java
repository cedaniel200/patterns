package com.cedaniel200.patterns.creational.abstractfactory.model;

public class Walls implements Drawable {

    private Drawable drawable;

    public Walls(Drawable drawable){
        this.drawable = drawable;
    }

    @Override
    public void paint() {
        this.drawable.paint();
    }
}
