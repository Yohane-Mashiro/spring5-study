package com.ciallo.springstudy1ioc.Service;

import com.ciallo.springstudy1ioc.Dao.Dao;

public class Choose_color implements Service {
    Dao color;

    @Override
    public void service() {
        color.color();
    }

    public Choose_color(Dao color) {
        this.color = color;
    }
}
