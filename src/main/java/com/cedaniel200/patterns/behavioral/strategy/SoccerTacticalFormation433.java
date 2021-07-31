package com.cedaniel200.patterns.behavioral.strategy;

public class SoccerTacticalFormation433 extends SoccerTacticalFormation {

    @Override
    public String getName() {
        return "4-3-3";
    }

    @Override
    public void paint() {
        paintPlayers(5);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(3, 5, 7);
        paintPlayers(3, 5, 7);
    }

}
