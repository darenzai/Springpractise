package com.daenzai.entitly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    public  static void main(String []args){


        ApplicationContext context=new ClassPathXmlApplicationContext("applicationConext.xml");

        //Categlory cat=(Categlory) context.getBean("c");
        //System.out.println(cat.name);
        Product pro=(Product) context.getBean("p");
        System.out.println(pro.getName());
        //通过ref注入对象的方式将实体类注入进来
        System.out.println(pro.getCatglory().getName());





      //  ApplicationContext context1=new ClassPathXmlApplicationContext("applicationConext.xml")

    }





}
