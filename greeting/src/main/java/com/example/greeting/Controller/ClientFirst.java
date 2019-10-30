package com.example.greeting.Controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("server-hello-world")
public interface ClientFirst {
    @RequestMapping("/hello1")
    String hello();
}
