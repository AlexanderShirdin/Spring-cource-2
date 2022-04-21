package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class ConfigurationApp {

    @Configuration
    @ComponentScan("org.example")
    @PropertySource("classpath:applicationProperty.properties")
    public class ConfigurationApps {

//    @Bean
//    public Cat cat(){
//        return new Cat();
//    }
//
//    @Bean
//    public Person person(){
//        return new Person(cat());
//    }
    }
}
