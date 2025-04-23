package com.ciallo.springstudy3ioc2;

import com.ciallo.springstudy3ioc2.Service.Service_1;
import com.ciallo.springstudy3ioc2.Service.Service_2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringStudy3Ioc2Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext test=new ClassPathXmlApplicationContext("applicationContext.xml");
        Service_1 service = (Service_1) test.getBean("service1");
//      service.setName("test");
        service.show();
        Service_2 service2 = (Service_2) test.getBean("service2");
        service2.shownewnew();
    }
}
