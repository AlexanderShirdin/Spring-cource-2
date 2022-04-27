package org.lesson2.DZ.configurationClassBean;

import org.springframework.beans.factory.annotation.Value;

public class Window {
    @Value(value = "${window.material}")
    String material;
    @Value(value = "${window.color}")
    String color;
    @Value(value = "${window.quantity}")
    int quantity;

    public void houseWindows() {
        System.out.println("Windows - We are clean!");
    }
}