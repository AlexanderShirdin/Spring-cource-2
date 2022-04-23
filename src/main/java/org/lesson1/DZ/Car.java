package org.lesson1.DZ;

public class Car {
    String type;
    String color;
    int horsePower;

    void Car() {
        System.out.println("Car - I'm is very expensive and fast!");
    }

    public Car() {
//        System.out.println("Car is created");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}