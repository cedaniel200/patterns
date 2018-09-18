package com.cedaniel200.patterns.creational.abstractfactory.model;

public class Floor implements Drawable {

    private Drawable drawable;

    public Floor(Drawable drawable){
        this.drawable = drawable;
    }

    @Override
    public void paint() {
        this.drawable.paint();
    }
}
