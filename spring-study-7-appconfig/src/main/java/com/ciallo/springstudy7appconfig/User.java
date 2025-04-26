package com.ciallo.springstudy7appconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("newnew")
    public String name;
    public String getName() {
        return name;
    }


}
