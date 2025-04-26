package com.ciallo.springstudy4di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringStudy4DiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
//        newnew.show();
        people.show_hobbies();
        people.show();
    }

}
