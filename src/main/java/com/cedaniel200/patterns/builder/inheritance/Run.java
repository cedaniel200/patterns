package com.cedaniel200.patterns.builder.inheritance;

import static com.cedaniel200.patterns.builder.inheritance.PersonBuilder.person;
import static com.cedaniel200.patterns.builder.inheritance.SuperHeroBuilder.superHero;
import static com.cedaniel200.patterns.builder.inheritance.VillainBuilder.villain;

public class Run {

    public static void main(String[] args) {
        exampleOfPerson();
        exampleOfSuperHero();
        exampleOfVillain();
        yourCharacters();
    }

    private static void exampleOfPerson() {
        Person person = person()
                .firstName("Cesar")
                .surname("Meneses")
                .age(17)
                .build();

        showInformationOfPerson(person);
    }

    private static void exampleOfSuperHero() {
        SuperHero superHero = superHero()
                .firstName("Clark")
                .secondSurname("Kent")
                .age(29)
                .addSuperpower("Super strength")
                .addSuperpower("fly")
                .build();

        showInformationOfPerson(superHero);
    }

    private static void exampleOfVillain() {
        Villain villain = villain()
                .firstName("Lex")
                .surname("Luthor")
                .age(30)
                .addWeapon("kryptonite")
                .build();

        showInformationOfPerson(villain);
    }

    private static void yourCharacters() {
        // TODO create your characters
    }

    private static void showInformationOfPerson(Person person) {
        System.out.println(person.toString());
    }
}