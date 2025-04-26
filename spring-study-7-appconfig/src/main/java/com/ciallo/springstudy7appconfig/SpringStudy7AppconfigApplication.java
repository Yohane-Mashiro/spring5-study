package com.ciallo.springstudy7appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciallo.springstudy7appconfig.config.LinConfig;

@SpringBootApplication
public class SpringStudy7AppconfigApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LinConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
        Newnew bean = (Newnew) context.getBean("getNewnew");
        bean.say();
    }
}
