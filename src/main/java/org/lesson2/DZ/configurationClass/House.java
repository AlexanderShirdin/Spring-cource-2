package org.lesson2.DZ.configurationClass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class House {
    @Value(value = "${house.type}")
    String type;
    @Value(value = "${house.color}")
    String color;
    @Value(value = "${house.square}")
    int square;
    Wall wall;
    Door door;
    Window window;

    void House() {
        System.out.println("House - I'm is very large!");
    }

    void houseWalls() {
        System.out.println("House - I have strong walls.");
        wall.houseWalls();
    }

    void houseDoor() {
        System.out.println("House - I have a wide door.");
        door.houseDoor();
    }

    void houseWindows() {
        System.out.println("House - I have big windows.");
        window.houseWindows();
    }

    public House(Wall wall, Door door, Window window) {
        this.wall = wall;
        this.door = door;
        this.window = window;
    }
}