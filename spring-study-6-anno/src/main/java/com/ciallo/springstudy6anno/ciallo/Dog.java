package com.ciallo.springstudy6anno.ciallo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Dog {
    public void shout(){
        System.out.println("dog shout");
    }
}
