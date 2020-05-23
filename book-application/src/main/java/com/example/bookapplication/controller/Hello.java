package com.example.bookapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, how are you?";
    }

    // @GetMapping("/users")
    // public String findUsers() {
    //     return "I have found the users";
    // ;}
}
