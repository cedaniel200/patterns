package com.cedaniel200.patterns.behavioral.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public abstract class SoccerTacticalFormation {

    private static final int MAX_POSITIONS = 9;
    public static final String DEFAULT_CHARACTER = "*";

    protected void paintPlayers(Integer... positions) {
        paintPlayers(DEFAULT_CHARACTER, positions);
    }

    protected void paintPlayers(String character, Integer... positions){
        List<Integer> positionsPlayers = Arrays.asList(positions);
        IntStream.rangeClosed(1, MAX_POSITIONS).boxed()
                .map(c -> positionsPlayers.contains(c) ? character : " ")
                .forEach(System.out::print);
        System.out.print("\n");
    }

    public abstract String getName();

    public abstract void paint();
}