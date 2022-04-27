package org.lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationApp.class);

        Person person = context.getBean("person", Person.class);
        person.comeMyPet();

        System.out.println(person.age);
        System.out.println(person.name);

        context.close();
    }
}
