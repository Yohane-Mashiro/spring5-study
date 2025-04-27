package com.ciallo.springstudy8proxy.proxy3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyServer implements InvocationHandler {
    private Rent rent;
    private String msg;

    public void newnewProxy(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        print_log(method.getName());
        return method.invoke(rent, args);
    }

    public void print_log(String msg) {
        System.out.println("实现了" + msg);
    }
}
