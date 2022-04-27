package org.lesson2.DZ.configurationClassBean;

import org.springframework.beans.factory.annotation.Value;

public class Pet {
    @Value(value = "${pet.type}")
    String type;
    @Value(value = "${pet.breed}")
    String breed;
    @Value(value = "${pet.name}")
    String name;
    @Value(value = "${pet.age}")
    int age;

    public void pet() {
        System.out.println("Pet - I'm smart!");
    }
}