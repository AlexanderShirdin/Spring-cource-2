package org.example;

import org.springframework.stereotype.Service;

//@Service
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog is created");
    }

    @Override
    public void say() {
        System.out.println("Gav-gav");
    }
}
