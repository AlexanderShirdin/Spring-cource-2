package org.lesson2.DZ.annotations;

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

    public void house() {
        System.out.println("Employee - I work in this house.");
        house.house();
    }

    public void car() {
        System.out.println("Employee - I'm washing and repairing this car.");
        car.car();
    }

    public void pet() {
        System.out.println("Employee - I walk and feed the pet.");
        pet.pet();
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