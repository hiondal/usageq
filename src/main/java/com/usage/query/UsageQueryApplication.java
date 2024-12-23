package com.usage.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class UsageQueryApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsageQueryApplication.class, args);
    }
}
