package com.yuwei.volte;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = {"com.yuwei.volte"})
@SpringBootApplication
@EnableScheduling
public class VolteApplication {

    public static void main(String[] args) {
        PropertyConfigurator.configure("config/log4j.properties");
        SpringApplication.run(VolteApplication.class, args);

    }
}
