package com.darryl.consumer_app.controller;

import com.darryl.consumer_app.remote.RemoteSayHelloService;
import com.darryl.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: Darryl
 * @Description: call remote interface controller
 * @Date: created in 2020/4/1 21:24
 */
@RestController
@RequestMapping(value = "/remote")
public class RemoteController {

    @Autowired
    private RemoteSayHelloService remoteSayHelloService;

    @GetMapping(value = "/{name}")
    public String remoteSayHello(@PathVariable String name){
        return remoteSayHelloService.remoteSayHello(name);
    }

    @PostMapping(value = "/user")
    public String remoteUserSayHello(@RequestBody UserModel user){
        return remoteSayHelloService.remoteUserSayHello(user);
    }
}
