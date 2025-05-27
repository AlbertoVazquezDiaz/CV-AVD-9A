package org.example.cvavd9a.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user2")
@CrossOrigin("*")
public class User2Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from User2Controller";
    }
}
