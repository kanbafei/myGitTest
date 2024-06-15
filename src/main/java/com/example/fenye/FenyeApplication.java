package com.example.fenye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FenyeApplication {
    public static void main(String[] args) {
        SpringApplication.run(FenyeApplication.class, args);
    }

}
