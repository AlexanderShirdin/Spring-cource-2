package org.lesson2.DZ.configurationClassBean;

import org.springframework.beans.factory.annotation.Value;

public class Door {
    @Value(value = "${door.material}")
    String material;
    @Value(value = "${door.color}")
    String color;

    public void houseDoor() {
        System.out.println("Door - I'm reliable!");
    }
}