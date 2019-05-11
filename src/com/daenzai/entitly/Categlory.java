package com.daenzai.entitly;

import org.springframework.stereotype.Component;

@Component("c") //用注解的方式代替XML配置
public class Categlory {


    public int id;
    public String name="222";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
