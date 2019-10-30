package com.example.greeting.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class HelloWorldClient {
    @Autowired
    private TheClient theClient;

    @FeignClient(name = "server-hello-world")
    interface TheClient {

        @RequestMapping(path = "/hello", method = RequestMethod.GET)
        @ResponseBody
        String HelloWorld();
    }

    public String HelloWorld() {
        return theClient.HelloWorld();
    }
}
