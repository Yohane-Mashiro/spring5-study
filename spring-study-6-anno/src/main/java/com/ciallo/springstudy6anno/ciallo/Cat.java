package com.ciallo.springstudy6anno.ciallo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于 <bean id="cat" class="com.clallo.springstudy6anno.ciallo.Cat"/>
//@Component 组件
@Component
@Scope("singleton")
public class Cat {
    //默认初始值
    @Value("newnew")
    public String name;
}
