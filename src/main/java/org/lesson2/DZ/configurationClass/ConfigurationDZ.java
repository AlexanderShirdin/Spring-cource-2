package org.lesson2.DZ.configurationClass;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.lesson2.DZ.configurationClass")
@PropertySource(value = "classpath:applicationProperty.properties")
public class ConfigurationDZ {

}
