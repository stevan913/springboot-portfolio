package com.chs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
//@Tag(name = "Projects", description = "Portfolio Project APIs")
public class TestController {
    @GetMapping("/")
    public String home() {
        return "Welcome to My Java Gradle Portfolio!";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Spring Boot is running successfully!";
    }
}
