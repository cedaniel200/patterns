package com.cedaniel200.patterns.builder.inheritance;

import com.cedaniel200.patterns.builder.Builder;

public class PersonBuilder <T extends PersonBuilder<T>> implements Builder<Person>  {

    private int age;
    private String firstName;
    private String surname;
    private String secondSurname;

    public PersonBuilder() {
        this.age = 0;
        this.firstName = "NN";
        this.surname = "";
        this.secondSurname = "";
    }

    public static PersonBuilder person(){
        return new PersonBuilder();
    }

    public T age(int age) {
        this.age = age;
        return (T) this;
    }

    public T firstName(String firstName) {
        this.firstName = firstName;
        return (T)this;
    }

    public T surname(String surname) {
        this.surname = surname;
        return (T)this;
    }

    public T secondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
        return (T)this;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    @Override
    public Person build() {
        return new Person(this);
    }
}
