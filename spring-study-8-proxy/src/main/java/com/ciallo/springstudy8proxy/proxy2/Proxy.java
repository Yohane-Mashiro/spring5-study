package com.ciallo.springstudy8proxy.proxy2;

import com.ciallo.springstudy8proxy.proxy2.Server;

public class Proxy implements Ciallo {
    Server server;
    public Proxy(Server server) {
        this.server = server;
    }
    public Proxy() {}
    @Override
    public void ciallo() {
        server.ciallo();
    }
}
