package com.darryl.consumer_app.remote.fallback;

import com.darryl.consumer_app.remote.RemoteSayHelloService;
import com.darryl.model.UserModel;
import org.springframework.stereotype.Component;

/**
 * @Auther: Darryl
 * @Description: when occur hystrix, need fall back
 * @Date: created in 2020/4/4 13:46
 */
@Component
public class RemoteSayHelloFallBack implements RemoteSayHelloService {

    @Override
    public String remoteSayHello(String name) {
        return this.remoteSayHelloFallBack(name);
    }

    @Override
    public String remoteUserSayHello(UserModel user) {
        return this.remoteUserSayHelloFallBack(user);
    }

    // fall back method
    protected String remoteSayHelloFallBack(String name) {
        return "fall back is " + name + " say Hello~~~";
    }

    // fall back method
    protected String remoteUserSayHelloFallBack(UserModel user) {
        return "fall back is " + user.getName() + " is age: " + user.getAge() + " say Hello~~";
    }
}
