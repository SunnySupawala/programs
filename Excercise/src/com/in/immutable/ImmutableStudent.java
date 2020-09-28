package com.in.immutable;

public final class ImmutableStudent {

    private final String name;
    private final int id ;
    private final Age age;

    public ImmutableStudent(String name, int id, Age age) {
        this.name = name;
        this.id = id;
        /*Age ageClone = new Age();
        ageClone.setDay(age.getDay());
        ageClone.setMonth(age.getMonth());
        ageClone.setYear(age.getYear());*/

        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
