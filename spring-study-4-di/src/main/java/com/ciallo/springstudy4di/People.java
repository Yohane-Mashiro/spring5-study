package com.ciallo.springstudy4di;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class People {
    private String name;
    private int age;
    private Boolean Sex;
    private Set hobbies;
    private Map canlender;


    public void show_hobbies(){
        System.out.println(hobbies);
    }

    public void show(){
        System.out.println(name);
        System.out.println(hobbies);
        System.out.println(canlender.get("5/12"));
    }

    public void setHobbies(Set hobbies) {
        this.hobbies = hobbies;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCanlender(Map canlender) {
        this.canlender = canlender;
    }
}
