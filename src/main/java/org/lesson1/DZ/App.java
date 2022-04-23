package org.lesson1.DZ;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = context.getBean("emp", Employee.class);
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