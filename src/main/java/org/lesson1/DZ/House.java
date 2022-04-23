package org.lesson1.DZ;

public class House {
    String type;
    String color;
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

    public House() {
//        System.out.println("House is created");
    }

    public House(Wall wall, Door door, Window window) {
        this.wall = wall;
        this.door = door;
        this.window = window;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}