package com.ciallo.springstudy8proxy.proxy1;

public class Silent {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Server());
        proxy.rent();
    }
}
