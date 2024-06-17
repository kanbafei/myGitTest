package com.example.fenye.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource("classpath:hahaha.properties")
//@ConfigurationProperties(prefix = "hahaha")
public class User {
    @Value("${hahaha.name}")
    String name;
    @Value("${hahaha.password}")
    String password;
}
