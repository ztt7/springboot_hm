package com.itheima.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        try {
            Class<?> clazz = Class.forName("com.itheima.bean.Wolf");
            if(clazz != null) {
                return new String[]{"com.itheima.bean.Cat"};
            }
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            //这时，返回一个空数组可以清晰地表示这种情况，而不需要返回 null 或者抛出异常。
            return new String[0];
        }
        return null;
    }
}
