package com.example.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${spring.application.name}")
    String servername;

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello World" + "<br/>服务端：" + servername ;
    }

    @GetMapping("/hello1")
    public String HelloWorldOne(){
        return "hello1";
    }
}
