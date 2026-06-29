package com.example.app5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello from App5";
    }

    @GetMapping("/health")
    public String health() {
        return "APP5 UP";
    }
}