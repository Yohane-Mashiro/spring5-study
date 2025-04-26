package com.ciallo.springstudy5autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringStudy5AutowiredApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beams.xml");
        Youzu youzu = context.getBean(Youzu.class);

        youzu.shout();
    }

}
