package com.itheima.config;

import com.itheima.bean.Dog;
import com.itheima.bean.DogFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration，这个类要被别人扫描，一定要写这个注解，不然它就不是配置类了
@Configuration
@ComponentScan({"com.itheima.bean","com.itheima.config"})
public class SpringConfig3 {

    @Bean
    public Dog dog11111(){
        return new Dog();
    }

    @Bean
    public DogFactoryBean dog22(){
        return new DogFactoryBean();
    }

}
