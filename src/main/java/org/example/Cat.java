package org.example;

import org.springframework.stereotype.Component;

@Component(value = "petBean") //cat
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Mau-mau");
    }

    public void init() {
        System.out.println("Init method class Cat");
    }

    public void destroy() {
        System.out.println("Destroy method class Cat");
    }
}
