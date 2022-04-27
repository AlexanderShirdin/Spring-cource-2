package org.lesson2.DZ.configurationClass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Window {
    @Value(value = "${window.material}")
    String material;
    @Value(value = "${window.color}")
    String color;
    @Value(value = "${window.quantity}")
    int quantity;

    void houseWindows() {
        System.out.println("Windows - We are clean!");
    }
}