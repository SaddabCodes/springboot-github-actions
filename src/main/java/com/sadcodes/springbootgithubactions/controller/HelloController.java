package com.sadcodes.springbootgithubactions.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public String hello(){
        return "Hello from Spring Boot Github Actions";
    }
}
