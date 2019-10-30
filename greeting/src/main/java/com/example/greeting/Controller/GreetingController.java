package com.example.greeting.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private HelloWorldClient helloWorldClient;

    @Autowired
    private ClientFirst clientFirst;
    
    @Value("${spring.application.name}")
    String clientname;

    @GetMapping("/gretting-hello1")
    public String greetingHello1(){
        return clientFirst.hello();
    }

    @GetMapping("/get-greeting")
    public String greeting(){
        return helloWorldClient.HelloWorld() + "<br/>客户端：" + clientname;
    }
}
