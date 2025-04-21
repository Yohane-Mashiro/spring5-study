package com.ciallo.springstudy1ioc;

import com.ciallo.springstudy1ioc.Dao.*;
import com.ciallo.springstudy1ioc.Service.Choose_color;
import com.ciallo.springstudy1ioc.Service.Service;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStudy1IocApplication {

    public static void main(String[] args) {
        Service service = new Choose_color(new Color_White());
        service.service();
    }

}