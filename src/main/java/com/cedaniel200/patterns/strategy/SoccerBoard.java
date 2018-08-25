package com.cedaniel200.patterns.strategy;

public class SoccerBoard {

    FootballFormationTactic formationTactic;

    public SoccerBoard() {
        this(new FootballFormationTactic442());
    }

    public SoccerBoard(FootballFormationTactic formationTactic) {
        this.formationTactic = formationTactic;
    }

    public void useFootballFormationTactic442(){
        setFormationTactic(new FootballFormationTactic442());
    }

    public void useFootballFormationTactic451(){
        setFormationTactic(new FootballFormationTactic451());
    }

    public void setFormationTactic(FootballFormationTactic formationTactic) {
        this.formationTactic = formationTactic;
    }

    public FootballFormationTactic getFormationTactic() {
        return formationTactic;
    }

    public void paintFormation(){
        FootballFormationTactic formationTactic = getFormationTactic();
        if(formationTactic != null){
           formationTactic.paint();
        }
    }

}
