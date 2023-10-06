package com.example.helloworld.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {


    public String printHelloWorld() {
        return "Hello"+"World"+"    "+"123";
    }
}
