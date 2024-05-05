package com.itheima.app;

import com.itheima.config.SpringConfig3;
import com.itheima.config.SpringConfig32;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App32 {
    public static void main(String[] args) {
        //使用AnnotationConfigApplicationContext加载一个类，这个类自己就会变成一个bean
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig32.class);
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }



    }
}
