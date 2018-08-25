package com.cedaniel200.patterns.strategy;

public class FootballFormationTactic442 extends AbstractFootballFormationTactic{

    @Override
    public void paint() {
        paintMessage("Football Formation Tactic 4-4-2");
        paintPlayers(5);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(4, 6);
        System.out.println("");
    }
}
