package com.cedaniel200.patterns.strategy;

public class FootballFormationTactic433 extends AbstractFootballFormationTactic{

    @Override
    public void paint() {
        paintMessage("Football Formation Tactic 4-3-3");
        paintPlayers(5);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(3, 5, 7);
        paintPlayers(3, 5, 7);
        paintMessage("");
    }

}
