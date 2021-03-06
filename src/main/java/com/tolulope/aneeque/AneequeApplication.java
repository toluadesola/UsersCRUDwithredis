package com.tolulope.aneeque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AneequeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AneequeApplication.class, args);
    }

}
