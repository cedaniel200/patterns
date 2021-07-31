package com.cedaniel200.patterns.behavioral.strategy;

public class SoccerTacticalFormation442 extends SoccerTacticalFormation {

    @Override
    public String getName() {
        return "4-4-2";
    }

    @Override
    public void paint() {
        paintPlayers(4, 6);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(1, 4, 6, 9);
        paintPlayers("#", 5);
    }
}
