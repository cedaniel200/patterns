package com.cedaniel200.patterns.behavioral.strategy;

public class SoccerFormationTactic451 extends AbstractSoccerFormationTactic {

    @Override
    public void paint() {
        paintMessage("Soccer Formation Tactic 4-5-1");
        paintPlayers(5);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(1, 3, 5, 7, 9);
        paintPlayers(5);
        paintMessage("");
    }

}
