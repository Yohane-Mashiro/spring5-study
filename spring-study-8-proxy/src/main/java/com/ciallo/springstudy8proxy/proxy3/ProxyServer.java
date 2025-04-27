package com.ciallo.springstudy8proxy.proxy3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyServer implements InvocationHandler {

    private Rent rent;

    public Object getproxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用放射机制实现
        return method.invoke(rent, args);
    }

    public void setRent(Rent rent) {
        this.rent=rent;
    }
}
