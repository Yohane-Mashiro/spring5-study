package com.ciallo.springstudy3ioc2.Service;


import org.springframework.stereotype.Service;

import java.io.Serializable;

public class Service_1 {


    private String name;

    public void show(){
        System.out.println(name);
    }
    public Service getService(){
        System.out.println("Service 1!");
        return null;
    }


    public void setName(String name) {
        this.name = name;
    }
}
