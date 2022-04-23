package org.lesson1.DZ;

public class Pet {
    String type;
    String breed;
    String name;
    int age;

    void Pet() {
        System.out.println("Pet - I'm smart!");
    }

    public Pet() {
//        System.out.println("Pet is created");
    }

    public Pet(String type, String breed, String name, int age) {
        this.type = type;
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}