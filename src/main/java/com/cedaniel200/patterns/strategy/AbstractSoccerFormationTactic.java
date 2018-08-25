package com.cedaniel200.patterns.strategy;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public abstract class AbstractSoccerFormationTactic implements SoccerFormationTactic {

    private static final int MAX_POSITIONS = 9;

    protected void paintPlayers(int... positions){
        List<Integer> positionsPlayers = Arrays.stream(positions).boxed().collect(toList());
        for (int i = 1; i <= MAX_POSITIONS; i ++){
            System.out.print(positionsPlayers.contains(i) ? "*" : " ");
        }
        System.out.println("");
    }

    protected void paintMessage(String message){
        System.out.println(message);
    }

    @Override
    public abstract void paint();
}