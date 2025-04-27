package com.ciallo.springstudy8proxy.proxy1;

public class Proxy implements Rent {
    private Server server;
    public Proxy() {}
    public Proxy(Server server) {
        this.server = server;
    }
    public void rent() {
        server.rent();
    }

}
