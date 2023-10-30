package org.lucky.collections.comparable;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Compare persons based on their age
        return this.age - otherPerson.getAge();
    }

    @Override
    public String toString() {
        return name + " - Age: " + age;
    }
}
