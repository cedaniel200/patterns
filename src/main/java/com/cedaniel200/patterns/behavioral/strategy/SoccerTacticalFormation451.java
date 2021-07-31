package com.cedaniel200.patterns.behavioral.strategy;

public class SoccerTacticalFormation451 extends SoccerTacticalFormation {

    @Override
    public String getName() {
        return "4-5-1";
    }

    @Override
    public void paint() {
        paintPlayers(5);
        paintPlayers(1, 3, 5, 7, 9);
        paintPlayers(1, 4, 6, 9);
        paintPlayers("#", 5);
    }

}
