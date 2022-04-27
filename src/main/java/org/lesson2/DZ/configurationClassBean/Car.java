package org.lesson2.DZ.configurationClassBean;

import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors (chain = true)
public class Car {
    String type;
    String color;
    int horsePower;

    public void car() {
        System.out.println("Car - I'm is very expensive and fast!");
    }
}