package com.test.dubbo.service.impl;

import com.test.dubbo.entity.User;
import com.test.dubbo.service.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public List getUsers() {
        List list = new ArrayList();
        User u1 = new User();
        u1.setName("siheyuan");
        u1.setAge(20);
        u1.setSex("f");

        User u2 = new User();
        u2.setName("batasi");
        u2.setAge(21);
        u2.setSex("m");


        list.add(u1);
        list.add(u2);

        return list;
    }
}
