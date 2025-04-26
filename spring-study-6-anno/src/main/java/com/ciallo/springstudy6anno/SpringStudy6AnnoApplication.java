package com.ciallo.springstudy6anno;

import com.ciallo.springstudy6anno.ciallo.Cat;
import com.ciallo.springstudy6anno.ciallo.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringStudy6AnnoApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beams.xml");
        context.start();
        //Animal animal = context.getBean("Animal" , Animal.class);
        Cat cat = (Cat) context.getBean("cat");
        Dog dog = (Dog) context.getBean("dog");
        dog.shout();
        System.out.println(cat.name);

    }

}
