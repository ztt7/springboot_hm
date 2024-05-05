package com.itheima.app;

import com.itheima.config.SpringConfig6;
import com.itheima.config.SpringConfig7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App7 {
    public static void main(String[] args) {
        //使用AnnotationConfigApplicationContext加载一个类，这个类自己就会变成一个bean
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig7.class);
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-----------------------------------");
    }
}
