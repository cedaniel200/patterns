package com.cedaniel200.patterns.strategy;

public class Run {

    public static void main(String[] args) {
        showFormationTactic451();
        showFormationTactic442();
        showFormationTactic433();
        showYourFormationTactic();
    }

    private static void showFormationTactic451() {
        SoccerBoard soccerBoard = new SoccerBoard();
        soccerBoard.useFootballFormationTactic451();
        soccerBoard.paintFormation();
    }

    private static void showFormationTactic442() {
        SoccerBoard soccerBoard = new SoccerBoard();
        soccerBoard.useFootballFormationTactic442();
        soccerBoard.paintFormation();
    }

    private static void showFormationTactic433() {
        SoccerBoard soccerBoard = new SoccerBoard();
        soccerBoard.setFormationTactic(new FootballFormationTactic433());
        soccerBoard.paintFormation();
    }

    private static void showYourFormationTactic() {
        // TODO create your soccer formation tactic
    }

}
