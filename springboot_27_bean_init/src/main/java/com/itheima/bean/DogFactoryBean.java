package com.itheima.bean;

import org.springframework.beans.factory.FactoryBean;

public class DogFactoryBean implements FactoryBean<Dog> {


    @Override
    public Dog getObject() throws Exception {
        Dog d = new Dog();
        //......自己对象的初始化
        return d;
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isSingleton() {
//        return FactoryBean.super.isSingleton();
        return true;
    }
}
