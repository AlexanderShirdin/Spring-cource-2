package org.lesson2.DZ.configurationClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationDZ.class);

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println("(Name: " + employee.name + "; Age: " + employee.age + ")");
        employee.House();
        System.out.println("(Type: " + employee.house.type + "; Color: " + employee.house.color + "; Square: " + employee.house.square + " m2)");
        employee.Car();
        System.out.println("(Type: " + employee.car.type + "; Color: " + employee.car.color + "; Horsepower: " + employee.car.horsePower + " hp)");
        employee.Pet();
        System.out.println("(Type: " + employee.pet.type + "; Breed: " + employee.pet.breed + "; Name: " + employee.pet.name + "; Age: " + employee.pet.age + ")");
        employee.house.houseWalls();
        System.out.println("(Material: " + employee.house.wall.material + "; Height: " + employee.house.wall.height + " m)");
        employee.house.houseDoor();
        System.out.println("(Material: " + employee.house.door.material + "; Color: " + employee.house.door.color + ")");
        employee.house.houseWindows();
        System.out.println("(Material: " + employee.house.window.material + "; Color: " + employee.house.window.color + "; Quantity: " + employee.house.window.quantity + ")");
    }
}