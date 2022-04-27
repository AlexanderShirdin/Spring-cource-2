package org.lesson2.DZ.configurationClassBean;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
@Setter
@Accessors(chain = true)
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

}