package com.gci.codein.springbootapp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

    /*
    * This class is the entry point for the spring boot application.
    * It enables component scanning and creates a Spring bean from
    * the controller class by looking at @RestController annotation.
    * It extends the class SpringBootServletInitializer to run a SpringApplication
    * from a traditional war deployment.
    */

@SpringBootApplication
public class MySpringBootApplication extends SpringBootServletInitializer{
    //The main method invokes SpringApplication.run() method to launch the application.
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }

    /*
    * Overriding configure() method from SpringBootServletInitializer class
    * to configure the application class.
    */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(MySpringBootApplication.class);
    }
}







