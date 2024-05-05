package com.itheima.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("==================");
        System.out.println("提示："+annotationMetadata.getClassName());
        System.out.println(annotationMetadata.hasAnnotation("org.springframework.context.annotation.Configuration"));
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes("org.springframework.context.annotation.ComponentScan");
        System.out.println(annotationAttributes);
        System.out.println("==================");


//        return new String[]{"com.itheima.bean.Dog","com.itheima.bean.Cat"};


        //各种条件的判定，判定完毕后，决定是否装载指定的bean
        boolean flag = annotationMetadata.hasAnnotation("org.springframework.context.annotation.Configuration");
        if(flag){
            return new String[]{"com.itheima.bean.Dog"};
        }
        return new String[]{"com.itheima.bean.Cat"};
    }
}
