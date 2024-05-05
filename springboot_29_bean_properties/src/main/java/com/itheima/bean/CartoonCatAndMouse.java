package com.itheima.bean;

import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
//@ConfigurationProperties(prefix = "cartoon")
public class CartoonCatAndMouse {
    private Cat cat;
    private Mouse mouse;

//    public CartoonCatAndMouse(){
//        cat = new Cat();
//        cat.setName("Tom");
//        cat.setAge(3);
//        mouse = new Mouse();
//        mouse.setName("Jerry");
//        mouse.setAge(4);
//    }

    public void play(){
        System.out.println(cat.getAge() + "岁的"+ cat.getName() + "和"+ mouse.getAge() +"岁的"+mouse.getName()+"打起来了");
    }
}
