package com.example.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/newUser")
    public String newUser() {
        return "new-user";
    }

    @PostMapping(value = "/homepage")
    public String homepage(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("Username: " + username + " Password: " + password);
        return "homepage";
    }
}
