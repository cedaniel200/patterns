package com.cedaniel200.patterns.behavioral.strategy;

public class SoccerFormationTactic442 extends AbstractSoccerFormationTactic {

    @Override
    public void paint() {
        paintMessage("Soccer Formation Tactic 4-4-2");
        paintPlayers(5);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(1, 4, 6, 9);
        paintPlayers(4, 6);
        System.out.println("");
    }
}
