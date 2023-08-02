package com.in28minutes.SpringBootWithJunitAndMockito.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorldController(){
        return "Hello World...";
    }
}
