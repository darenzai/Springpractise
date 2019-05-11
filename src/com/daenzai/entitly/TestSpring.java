package com.daenzai.entitly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    public  static void main(String []args){


        ApplicationContext context=new ClassPathXmlApplicationContext("applicationConext.xml");

        Categlory cat=(Categlory) context.getBean("c");
        System.out.println("asSSSSasa");

        System.out.println(cat.name);


    }





}
