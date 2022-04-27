package org.lesson2.DZ.configurationClass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pet {
    @Value(value = "${pet.type}")
    String type;
    @Value(value = "${pet.breed}")
    String breed;
    @Value(value = "${pet.name}")
    String name;
    @Value(value = "${pet.age}")
    int age;

    void Pet() {
        System.out.println("Pet - I'm smart!");
    }
}