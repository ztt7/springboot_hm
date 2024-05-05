package com.itheima.config;

import com.itheima.bean.Cat;
import com.itheima.bean.Mouse;
import com.itheima.bean.MyImportSelector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//@Import(MyImportSelector.class)
public class SpringConfig {
    @Bean
//    @ConditionalOnClass(Mouse.class)
    @ConditionalOnClass(name = "com.itheima.bean.Mouse")
//    @ConditionalOnMissingClass("com.itheima.bean.Wolf")
    public Cat tom(){
        return new Cat();
    }
}
