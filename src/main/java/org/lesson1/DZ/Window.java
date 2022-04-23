package org.lesson1.DZ;

public class Window {
    String material;
    String color;
    int quantity;

    void houseWindows() {
        System.out.println("Windows - We are clean!");
    }

    public Window() {
//        System.out.println("Pet is created");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}