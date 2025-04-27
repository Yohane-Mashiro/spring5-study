package com.ciallo.springstudy8proxy.proxy3;

public class Client {
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer();
        proxyServer.newnewProxy(new Ciallo());
        Rent proxy = (Rent) proxyServer.getProxy();
        proxy.rent();

        proxyServer.newnewProxy(new Ciallo1());
        Rent proxy1 = (Rent) proxyServer.getProxy();
        proxy1.rent();


    }
}
