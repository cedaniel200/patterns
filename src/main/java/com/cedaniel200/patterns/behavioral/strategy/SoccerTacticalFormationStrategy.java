package com.cedaniel200.patterns.behavioral.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public abstract class SoccerTacticalFormationStrategy {

    public static final int MIN_POSITION = 1;
    public static final int MAX_POSITION = 9;
    public static final String DEFAULT_CHARACTER = "*";

    protected void paintPlayers(Integer... positions) {
        paintPlayers(DEFAULT_CHARACTER, positions);
    }

    protected void paintPlayers(String character, Integer... positions){
        List<Integer> positionsPlayers = Arrays.asList(positions);
        IntStream.rangeClosed(MIN_POSITION, MAX_POSITION).boxed()
                .map(positionOnTheBoard -> positionsPlayers.contains(positionOnTheBoard) ? character : " ")
                .forEach(System.out::print);
        System.out.print("\n");
    }

    public abstract String getName();

    public abstract void paint();
}