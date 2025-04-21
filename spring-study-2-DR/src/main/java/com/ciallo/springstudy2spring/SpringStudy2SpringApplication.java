package com.ciallo.springstudy2spring;

import com.ciallo.springstudy2spring.Service.NewNew;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringStudy2SpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean.xml");
        NewNew say= (NewNew) context.getBean("newnew");
        System.out.printf(say.to_newnew());
    }
}
