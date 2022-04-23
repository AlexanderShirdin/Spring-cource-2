package org.lesson1.DZ;

public class Wall {
    String material;
    int height;

    void houseWalls() {
        System.out.println("Walls - We're fat!");
    }

    public Wall() {
//        System.out.println("Pet is created");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}