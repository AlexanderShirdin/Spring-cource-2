package org.lesson1;

public class Person {
    String name;
    int age;
    Pet pet;

    void comeMyPet() {
        System.out.println("Hello my " + pet.getClass().getSimpleName());
        pet.say();
    }

    public Person() {
        System.out.println("Person is created");
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    // pet -> setPet
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
