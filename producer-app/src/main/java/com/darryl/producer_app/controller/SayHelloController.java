package com.darryl.producer_app.controller;

import com.darryl.model.UserModel;
import com.darryl.producer_app.business.SayHelloService;
import com.darryl.producer_app.kafka.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: Darryl
 * @Description: say-hello-controller instance
 * @Date: created in 2020/4/1 20:51
 */
@RestController
@RequestMapping(value = "/hello")
public class SayHelloController {

    @Autowired
    private SayHelloService sayHelloService;
    @Autowired
    private KafkaSender kafkaSender;

    @GetMapping(value = "/{name}")
    public String say(@PathVariable String name){
        return sayHelloService.sayHello(name);
    }

    @PostMapping(value = "/userSay")
    public String userSay(@RequestBody UserModel user) {
        return sayHelloService.userSayHello(user);
    }

    @GetMapping(value = "/streamSender")
    public String streamSender(String msg){
        kafkaSender.sendMsg(msg);
        return "OK";
    }
}
