package com.darryl.producer_app.business.impl;

import com.darryl.model.UserModel;
import com.darryl.producer_app.business.SayHelloService;
import org.springframework.stereotype.Service;

/**
 * @Auther: Darryl
 * @Description: say-hello-service instance class
 * @Date: created in 2020/4/1 20:48
 */
@Service
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello(String name) {
        return name + " say HELLO to you~~~";
    }

    @Override
    public String userSayHello(UserModel user) {
        return user.getName() + " is " + user.getAge() + " say Hello to you~~~";
    }
}
