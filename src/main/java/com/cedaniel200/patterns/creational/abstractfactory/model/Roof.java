package com.cedaniel200.patterns.creational.abstractfactory.model;

public class Roof implements Drawable {

    private Drawable drawable;

    public Roof(Drawable drawable){
        this.drawable = drawable;
    }

    @Override
    public void paint(){
        this.drawable.paint();
    }

}
