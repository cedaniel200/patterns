package com.cedaniel200.patterns.strategy;

public class FootballFormationTactic451 extends AbstractFootballFormationTactic {

    @Override
    public void paint() {
        paintMessage("Football Formation Tactic 4-5-1");
        paintPlayers(5);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(1, 3, 5, 7, 9);
        paintPlayers(5);
        paintMessage("");
    }

}
