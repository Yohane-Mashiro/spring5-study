package com.ciallo.springstudy8proxy.proxy3;

public class Silent {
    public static void main(String[] args) {
        Ciallo ciallo = new Ciallo();
        ProxyServer proxyServer = new ProxyServer();
        proxyServer.setRent(ciallo);
        Rent proxy = (Rent) proxyServer.getproxy();
        proxy.rent();

    }
}
