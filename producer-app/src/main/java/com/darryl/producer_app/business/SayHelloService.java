package com.darryl.producer_app.business;

import com.darryl.model.UserModel;

/**
 * @Auther: Darryl
 * @Description: say hello service interface
 * @Date: created in 2020/4/1 20:47
 */
public interface SayHelloService {
    String sayHello(String name);

    String userSayHello(UserModel user);
}
