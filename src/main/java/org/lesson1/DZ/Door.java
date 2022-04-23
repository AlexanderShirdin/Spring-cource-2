package org.lesson1.DZ;

public class Door {
    String material;
    String color;

    void houseDoor() {
        System.out.println("Door - I'm reliable!");
    }

    public Door() {
//        System.out.println("Pet is created");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }
}