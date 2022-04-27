package org.lesson2.DZ.configurationClassBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.lesson2.DZ.configurationClassBean")
@PropertySource(value = "classpath:applicationProperty.properties")
public class ConfigurationBean {

    @Value(value = "${car.type}")
    String type;
    @Value(value = "${car.color}")
    String color;
    @Value(value = "${car.horsePower}")
    int horsePower;

    @Bean
    Employee employee() {
        Employee employee = new Employee();
        employee.setHouse(house());
        employee.setCar(car());
        employee.setPet(pet());
        return employee;
    }

    @Bean
    Car car() {
        return new Car()
                .setType(type)
                .setColor(color)
                .setHorsePower(horsePower);
    }

    @Bean
    Pet pet() {
        return new Pet();
    }

    @Bean
    House house() {
        return new House(wall(),door(),window());
    }

    @Bean
    Wall wall() {
        return new Wall();
    }

    @Bean
    Window window() {
        return new Window();
    }

    @Bean
    Door door() {
        return new Door();
    }
}
