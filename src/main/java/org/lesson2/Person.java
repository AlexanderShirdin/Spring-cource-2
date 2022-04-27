package org.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = "prototype")
public class Person {
    @Value(value = "${person.name}")
    String name;
    @Value(value = "${person.age}")
    int age;

    //    @Autowired
//    @Qualifier(value = "cat")
    private final Pet pet;

    void comeMyPet() {
        System.out.println("Hello my " + pet.getClass().getSimpleName());
        pet.say();
    }

    //    public Person() {
//        System.out.println("Person is created");
//    }
    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }

    // pet -> setPet
//    @Autowired
//    @Qualifier(value = "dog")
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }
    @PostConstruct
    public void init() {
        System.out.println("Init method class Person");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
