package com.jeC.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    // read data from: application.properties
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
}
