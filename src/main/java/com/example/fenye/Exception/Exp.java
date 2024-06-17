package com.example.fenye.Exception;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exp{
    @ExceptionHandler(Exception.class)
    public String ex(Exception e){
        e.printStackTrace();
        return StringUtils.hasLength(e.getMessage())?e.getMessage():"出错了";
    }
}
