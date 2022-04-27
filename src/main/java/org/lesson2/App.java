package org.lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
               new ClassPathXmlApplicationContext("applicationContext1.xml");

        Pet cat = context.getBean("cat", Pet.class);
//      Pet dog = context.getBean("dog", Pet.class);

        System.out.println("*************************");

        Person person = context.getBean("person", Person.class);
        Person person1 = context.getBean("person", Person.class);
        person.comeMyPet();
        System.out.println(person.name);
        System.out.println(person.age);

        context.close();
    }
}
