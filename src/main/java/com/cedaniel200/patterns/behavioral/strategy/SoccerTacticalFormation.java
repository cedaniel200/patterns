package com.cedaniel200.patterns.behavioral.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public abstract class SoccerTacticalFormation {

    public static final int MIN_POSITIONS = 1;
    public static final int MAX_POSITIONS = 9;
    public static final String DEFAULT_CHARACTER = "*";

    protected void paintPlayers(Integer... positions) {
        paintPlayers(DEFAULT_CHARACTER, positions);
    }

    protected void paintPlayers(String character, Integer... positions){
        List<Integer> positionsPlayers = Arrays.asList(positions);
        IntStream.rangeClosed(MIN_POSITIONS, MAX_POSITIONS).boxed()
                .map(positionOnTheBoard -> positionsPlayers.contains(positionOnTheBoard) ? character : " ")
                .forEach(System.out::print);
        System.out.print("\n");
    }

    public abstract String getName();

    public abstract void paint();
}