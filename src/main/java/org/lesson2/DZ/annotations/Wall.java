package org.lesson2.DZ.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Wall {
    @Value(value = "${wall.material}")
    String material;
    @Value(value = "${wall.height}")
    int height;

    public void houseWalls() {
        System.out.println("Walls - We're fat!");
    }
}