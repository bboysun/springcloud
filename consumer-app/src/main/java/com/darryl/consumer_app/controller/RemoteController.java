package com.darryl.consumer_app.controller;

import com.darryl.consumer_app.remote.RemoteSayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
