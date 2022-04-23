package org.lesson1;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Mau-mau");
    }
}
