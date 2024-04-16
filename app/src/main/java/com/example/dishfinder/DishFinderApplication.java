package com.example.dishfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class})
@EnableCaching
public class DishFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DishFinderApplication.class, args);
    }

}
