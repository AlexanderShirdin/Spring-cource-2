package org.lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
               new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat pet = context.getBean("petBean", Cat.class);
        pet.say();

//        Person person = context.getBean("person", Person.class);
//        Person person2 = context.getBean("person", Person.class);
//        person2.setName("Ivan");
//        person2.setAge(50);
//
//        System.out.println("Person name " + person.name);
//        System.out.println("Person ag e" + person.age);
//
//        System.out.println("Person2 name " + person2.name);
//        System.out.println("Person2 age " + person2.age);
//        person.comeMyPet();
//        System.out.println(person.age);
//        System.out.println(person.name);

//        Pet pet1 = new Cat();
//        Person person = new Person(pet1);
//        person.comeMyPet();

//       Pet pet=new Dog();
//       pet.say();

    }
}
