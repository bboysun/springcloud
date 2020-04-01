package com.darryl.producer_app.controller;

import com.darryl.producer_app.business.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value = "/{name}")
    public String say(@PathVariable String name){
        return sayHelloService.sayHello(name);
    }
}
