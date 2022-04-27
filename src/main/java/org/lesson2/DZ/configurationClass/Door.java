package org.lesson2.DZ.configurationClass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Door {
    @Value(value = "${door.material}")
    String material;
    @Value(value = "${door.color}")
    String color;

    void houseDoor() {
        System.out.println("Door - I'm reliable!");
    }
}