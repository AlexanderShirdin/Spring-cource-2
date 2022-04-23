package org.lesson1.DZ;

public class Employee {
    String name;
    int age;
    House house;
    Car car;
    Pet pet;

    void House() {
        System.out.println("Employee - I work in this house.");
        house.House();
    }

    void Car() {
        System.out.println("Employee - I'm washing and repairing this car.");
        car.Car();
    }

    void Pet() {
        System.out.println("Employee - I walk and feed the pet.");
        pet.Pet();
    }

    public Employee() {
//        System.out.println("Employee is created");
    }

    public Employee(House house, Car car, Pet pet) {
        this.house = house;
        this.car = car;
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}