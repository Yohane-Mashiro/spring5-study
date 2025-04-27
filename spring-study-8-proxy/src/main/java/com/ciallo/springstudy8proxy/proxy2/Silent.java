package com.ciallo.springstudy8proxy.proxy2;

public class Silent {
    public static void main(String[] args) {
        Server server = new Server();
        Proxy proxy = new Proxy(server);
        proxy.ciallo();
    }
}
