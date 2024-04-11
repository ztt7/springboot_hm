package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
//properties属性可以为当前测试用例添加临时的属性配置
//@SpringBootTest(properties = {"test.prop=testValue1"})
//args属性可以为当前测试用例添加临时的命令行参数
//@SpringBootTest(args={"--test.prop=testValue2"})
@SpringBootTest(args={"--test.prop=testValue2"},properties = {"test.prop=testValue1"})
public class PropertiesAndArgsTest {

    //方式一：使用@Value注解，配合yml配置文件的属性
    @Value("${test.prop}")
    private String msg;

    @Test
    void testProperties(){
        System.out.println(msg);
    }
}
