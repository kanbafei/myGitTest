package com.example.fenye;

import com.example.fenye.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class FenyeApplicationTests {
    @Test
    void contextLoads() {
        String a="sss";
        boolean b= StringUtils.hasLength(a);
        System.out.println(b);
    }
    LocalDateTime time = LocalDateTime.of(2002, 10, 10, 18, 22, 10);
    @Autowired
    User user;
    @Test
    void ss(){
        System.out.println("--------------------------------");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = time.format(dateTimeFormatter);
        System.out.println(format);
        System.out.println("--------------------------------");
        System.out.println(user.toString());
    }
}
