package com.itheima.config;

import com.itheima.bean.MyPostProcessor;
import com.itheima.bean.MyRegistrar;
import com.itheima.bean.MyRegistrar2;
import com.itheima.bean.impl.BookServiceImpl1;
import org.springframework.context.annotation.Import;

@Import({MyRegistrar.class,BookServiceImpl1.class, MyRegistrar2.class, MyPostProcessor.class})
public class SpringConfig8 {
}
