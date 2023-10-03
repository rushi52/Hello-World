package com.example.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {
    @GetMapping
    private List helloWorld()
    {
        return List.of("Hello","World!!!!123");

    }

}
