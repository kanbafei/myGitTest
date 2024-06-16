package com.example.fenye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FenyeApplication {
    public static void main(String[] args) {
        System.out.println("master test");
        System.out.println("----------------------------------------------------------------");
        System.out.println("hot-test 分支");
        System.out.println("----------------------------------------------------------------");
        System.out.println("从idea修改文档");
        SpringApplication.run(FenyeApplication.class, args);
    }

}
