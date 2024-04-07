package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    //读取yaml数据中的单一数据
    @Value("${country}")
    private String country1;
    @Value("${enterprise.name}")
    private String enterprise1;

    @Value("${subject[0]}")
    private String subject1;

    @GetMapping
    public String getById(){


        System.out.println("springboot is running...");

        System.out.println("country------>" + country1);
        System.out.println(enterprise1);
        System.out.println(subject1);
        return "springboot is running...";
    }
}
