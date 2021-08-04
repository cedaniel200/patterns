package com.cedaniel200.patterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        showSoccerTacticalFormation451();
        showSoccerTacticalFormation442();
        showSoccerTacticalFormation433();
        showYourSoccerTacticalFormation();
    }

    private static void showSoccerTacticalFormation451() {
        SoccerBoard soccerBoard = new SoccerBoard();
        soccerBoard.useSoccerTacticalFormation451();
        soccerBoard.paintTacticalFormation();
    }

    private static void showSoccerTacticalFormation442() {
        SoccerBoard soccerBoard = new SoccerBoard();
        soccerBoard.paintTacticalFormation();
    }

    private static void showSoccerTacticalFormation433() {
        SoccerBoard soccerBoard = new SoccerBoard();
        soccerBoard.setTacticalFormation(new SoccerTacticalFormation433());
        soccerBoard.paintTacticalFormation();
    }

    private static void showYourSoccerTacticalFormation() {
        // TODO create your soccer tactical formation
    }

}
