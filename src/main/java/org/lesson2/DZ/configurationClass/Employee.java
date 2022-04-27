package org.lesson2.DZ.configurationClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value(value = "${employee.name}")
    String name;
    @Value(value = "${employee.age}")
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

    @Autowired
    public void setHouse(House house) {
        this.house = house;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }
}