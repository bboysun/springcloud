package com.darryl.consumer_app.remote;

import com.darryl.model.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Auther: Darryl
 * @Description: call remote interface,
 * PRODUCER-A is all uppercase
 * /hello/{name} is full uri path
 * @Date: created in 2020/4/1 21:16
 */
@FeignClient("PRODUCER-A")
public interface RemoteSayHelloService {
    @GetMapping(value = "/hello/{name}")
    String remoteSayHello(@PathVariable("name") String name);

    @PostMapping(value = "/hello/userSay")
    String remoteUserSayHello(@RequestBody UserModel user);
}
