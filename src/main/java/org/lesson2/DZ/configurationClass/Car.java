package org.lesson2.DZ.configurationClass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value(value = "${car.type}")
    String type;
    @Value(value = "${car.color}")
    String color;
    @Value(value = "${car.horsePower}")
    int horsePower;

    void Car() {
        System.out.println("Car - I'm is very expensive and fast!");
    }
}