package com.cedaniel200.patterns.creational.abstractfactory.model;

public class House implements Drawable {

    private Roof roof;
    private Walls walls;
    private Floor floor;

    public House(Roof roof, Walls walls, Floor floor) {
        this.roof = roof;
        this.walls = walls;
        this.floor = floor;
    }

    @Override
    public void paint(){
        roof.paint();
        walls.paint();
        floor.paint();
    }

}
