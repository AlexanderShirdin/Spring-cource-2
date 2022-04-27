package org.lesson2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog is created");
    }

    @Override
    public void say() {
        System.out.println("Gav-gav");
    }
}
