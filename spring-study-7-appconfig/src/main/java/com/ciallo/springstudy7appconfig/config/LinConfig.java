package com.ciallo.springstudy7appconfig.config;

import com.ciallo.springstudy7appconfig.Newnew;
import com.ciallo.springstudy7appconfig.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//这个也会被Spring容器托管，注册到容器中，
// 因为他本身就是一个@Component
//@Configuration代表一个配置类，
// 就和我们之前看到的beans.xml是一样的
public class LinConfig {
    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean的对象
    }
    @Bean
    public Newnew getNewnew(){
        return new Newnew();
    }
}
