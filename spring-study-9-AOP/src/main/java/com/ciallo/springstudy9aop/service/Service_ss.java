package com.ciallo.springstudy9aop.service;


public class Service_ss implements Service{
    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");

    }

    @Override
    public void insert() {
        System.out.println("insert");

    }

    @Override
    public void query() {
        System.out.println("query");

    }
}
