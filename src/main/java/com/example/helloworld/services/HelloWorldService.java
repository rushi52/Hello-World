package com.example.helloworld.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldService {


    public List printHelloWorld() {
        return List.of("Hello","WOrld","    ","123");
    }
}
