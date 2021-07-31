package com.cedaniel200.patterns.behavioral.strategy;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public abstract class SoccerTacticalFormation {

    private static final int MAX_POSITIONS = 9;

    protected void paintPlayers(int... positions){
        List<Integer> positionsPlayers = Arrays.stream(positions).boxed().collect(toList());
        for (int i = MAX_POSITIONS; i >= 1 ; i --){
            System.out.print(positionsPlayers.contains(i) ? "*" : " ");
        }
        System.out.print("\n");
    }

    public abstract String getName();

    public abstract void paint();
}