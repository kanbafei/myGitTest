package com.example.fenye;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

@SpringBootTest
class FenyeApplicationTests {

    @Test
    void contextLoads() {
        String a="sss";
        boolean b= StringUtils.hasLength(a);
        System.out.println(b);
    }

}
