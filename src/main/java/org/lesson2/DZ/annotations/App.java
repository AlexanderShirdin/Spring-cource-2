package org.lesson2.DZ.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext1.xml");

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println("(Name: " + employee.name + "; Age: " + employee.age + ")");
        employee.house();
        System.out.println("(Type: " + employee.house.type + "; Color: " + employee.house.color + "; Square: " + employee.house.square + " m2)");
        employee.car();
        System.out.println("(Type: " + employee.car.type + "; Color: " + employee.car.color + "; Horsepower: " + employee.car.horsePower + " hp)");
        employee.pet();
        System.out.println("(Type: " + employee.pet.type + "; Breed: " + employee.pet.breed + "; Name: " + employee.pet.name + "; Age: " + employee.pet.age + ")");
        employee.house.houseWalls();
        System.out.println("(Material: " + employee.house.wall.material + "; Height: " + employee.house.wall.height + " m)");
        employee.house.houseDoor();
        System.out.println("(Material: " + employee.house.door.material + "; Color: " + employee.house.door.color + ")");
        employee.house.houseWindows();
        System.out.println("(Material: " + employee.house.window.material + "; Color: " + employee.house.window.color + "; Quantity: " + employee.house.window.quantity + ")");
    }
}