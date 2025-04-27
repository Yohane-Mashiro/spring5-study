package com.ciallo.springstudy9aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        if (target != null) {
            System.out.println(target.getClass().getName() + " 执行了 " + method.getName());
        }
    }
}
