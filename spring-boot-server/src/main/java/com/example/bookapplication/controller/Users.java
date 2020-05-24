package com.example.bookapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Users {
    @GetMapping
    public String sayWhatYouAre() {
        return "I am the beginning of the users endpoints";
    }

    @GetMapping("/login")
    public String login() {
        return "You have been authenticated";
    }
}
