package com.ciallo.springstudy9aop;

import com.ciallo.springstudy9aop.service.Service;
import com.ciallo.springstudy9aop.service.Service_ss;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringStudy9AopApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Service bean = (Service) context.getBean("service");
        bean.query();

    }

}
