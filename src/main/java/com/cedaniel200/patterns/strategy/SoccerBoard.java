package com.cedaniel200.patterns.strategy;

public class SoccerBoard {

    SoccerFormationTactic formationTactic;

    public SoccerBoard() {
        this(new SoccerFormationTactic442());
    }

    public SoccerBoard(SoccerFormationTactic formationTactic) {
        this.formationTactic = formationTactic;
    }

    public void useSoccerFormationTactic442(){
        setFormationTactic(new SoccerFormationTactic442());
    }

    public void useSoccerFormationTactic451(){
        setFormationTactic(new SoccerFormationTactic451());
    }

    public void setFormationTactic(SoccerFormationTactic formationTactic) {
        this.formationTactic = formationTactic;
    }

    public SoccerFormationTactic getFormationTactic() {
        return formationTactic;
    }

    public void paintFormation(){
        SoccerFormationTactic formationTactic = getFormationTactic();
        if(formationTactic != null){
           formationTactic.paint();
        }
    }

}
