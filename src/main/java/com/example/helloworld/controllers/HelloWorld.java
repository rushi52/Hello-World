package com.example.helloworld.controllers;

import com.example.helloworld.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorld {
    @Autowired
    private HelloWorldService helloWorldService;
    @GetMapping
    public  String helloWorld()
    {
        return helloWorldService.printHelloWorld().toString();


    }

}
