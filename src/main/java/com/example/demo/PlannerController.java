package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlannerController {

    @GetMapping("/")
    public String helloWorld() {
        return "Welcome to pocket planner!";
    }

}
