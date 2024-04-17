package com.itheima.domain;

import lombok.Data;

import java.io.Serializable;

//@Getter
//@Setter
@Data
public class Book implements Serializable {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
