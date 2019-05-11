package com.daenzai.entitly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component("p")
public class Product {

    //自动注入 注解 也可以写在Set方法上面
    @Autowired
    //@Resource(name="c") //c 直接引用的是XML文件的name
    public Categlory catglory;


    public int id;

    public String name="121";

    public Categlory getCatglory() {
        return catglory;
    }

    public void setCatglory(Categlory catglory) {
        this.catglory = catglory;
    }



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
