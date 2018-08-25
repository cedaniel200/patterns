package com.cedaniel200.patterns.builder.inheritance;

public class Person{

    private int age;
    private String firstName;
    private String surname;
    private String secondSurname;

    public Person(PersonBuilder builder) {
        this.age = builder.getAge();
        this.firstName = builder.getFirstName();
        this.surname = builder.getSurname();
        this.secondSurname = builder.getSecondSurname();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return firstName + " " + surname + " " + secondSurname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                '}';
    }
}
