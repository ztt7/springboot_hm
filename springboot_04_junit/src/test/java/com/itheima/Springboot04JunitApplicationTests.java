package com.itheima;

import com.itheima.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {
    // 1、注入你要测试的对象
    @Autowired
    private BookDao bookDao;
    // 2、执行要测试的对象对应的方法
    @Test
    public void bookSave(){
        bookDao.save();
    }


    @Test
    void contextLoads() {
        System.out.println("test....");
    }

}
