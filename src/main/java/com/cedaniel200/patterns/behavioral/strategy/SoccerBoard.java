package com.cedaniel200.patterns.behavioral.strategy;

public class SoccerBoard {

    public static final String TITLE_FORMAT = "Soccer tactical Formation %s\n";

    private SoccerTacticalFormation tacticalFormation;

    public SoccerBoard() {
        this(new SoccerTacticalFormation442());
    }

    public SoccerBoard(SoccerTacticalFormation tacticalFormation) {
        this.tacticalFormation = tacticalFormation;
    }

    public void useSoccerTacticalFormation442() {
        setTacticalFormation(new SoccerTacticalFormation442());
    }

    public void useSoccerTacticalFormation451() {
        setTacticalFormation(new SoccerTacticalFormation451());
    }

    public void setTacticalFormation(SoccerTacticalFormation tacticalFormation) {
        this.tacticalFormation = tacticalFormation;
    }

    public SoccerTacticalFormation getTacticalFormation() {
        return tacticalFormation;
    }

    public void paintTacticalFormation() {
        validateTacticalFormation();
        System.out.printf(TITLE_FORMAT, this.tacticalFormation.getName());
        System.out.println("---------");
        this.tacticalFormation.paint();
        System.out.println("---------\n");
    }

    private void validateTacticalFormation() {
        if (this.tacticalFormation == null)
            throw new IllegalStateException("It is necessary to set a soccer tactical formation");
    }
}