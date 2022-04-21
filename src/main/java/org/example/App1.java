package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext1.xml");

        Pet cat = context.getBean("petBean", Pet.class);
//        Pet dog = context.getBean("dog", Pet.class);
//        dog.say();
        System.out.println("*********************************");

        Person person = context.getBean("person", Person.class);
        Person person1 = context.getBean("person", Person.class);
        person.comeMyPet();
        System.out.println(person.name);
        System.out.println(person.age);

        context.close();
    }
}
