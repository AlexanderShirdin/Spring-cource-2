package org.lesson2;//package org.example;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//@Scope(value = "prototype")
//public class Person {
//    @Value("${person.name}")
//    String name;
//    @Value("${person.age}")
//    int age;
//
//
//    private final Pet pet;
//
//    void comeMyPet(){
//        System.out.println("Hello my pet");
//        pet.say();
//    }
//
//
//@Autowired
//    public Person( Pet pet) {
//        this.pet = pet;
//    }
//
////    public void setPet(Pet pet) {
////        this.pet = pet;
////    }
//@PostConstruct
//public void init(){
//    System.out.println("init method class Person");
//}
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
