package com.cedaniel200.patterns.strategy;

public class SoccerFormationTactic433 extends AbstractSoccerFormationTactic {

    @Override
    public void paint() {
        paintMessage("Soccer Formation Tactic 4-3-3");
        paintPlayers(5);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(3, 5, 7);
        paintPlayers(3, 5, 7);
        paintMessage("");
    }

}
