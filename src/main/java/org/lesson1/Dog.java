package org.lesson1;

public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog is created");
    }

    @Override
    public void say() {
        System.out.println("Gav-gav");
    }
}
